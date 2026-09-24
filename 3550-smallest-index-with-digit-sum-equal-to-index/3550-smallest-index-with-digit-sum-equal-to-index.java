class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int num=nums[i];
            int sum=0;
            while(num>0){
                int n1=num%10;
                sum+=n1;
                num/=10;
            }
            if(i==sum){
                return i;
            }
        }
        return -1;
    }
}