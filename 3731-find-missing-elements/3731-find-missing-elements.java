class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer>list=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int num=nums[0];
        while(num!=nums[nums.length-1]){
            if(!set.contains(num)){
                list.add(num);
            }
            num++;
        }
        return list;
    }
}