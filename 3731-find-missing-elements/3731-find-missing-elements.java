class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        List<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
            set.add(num);
        }
        while(min!=max){
            if(!set.contains(min)){
                list.add(min);
            }
            min++;
        }
        return list;
    }
}