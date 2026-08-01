class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        int n=grid.length*grid.length;
        int sum=0;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])) {
                    ans[0]=grid[i][j];
                    continue;
                }
                sum+=grid[i][j];
                set.add(grid[i][j]);
            }
        }
        ans[1]=(n*(n+1)/2)-sum;
        return ans;
    }
}