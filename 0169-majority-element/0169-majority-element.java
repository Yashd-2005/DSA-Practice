class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int highestCount=0;
        for(int num:nums){
            if(count==0) highestCount=num;

            if(num==highestCount) count++;
            else count--;
        }
        return highestCount;
    }
}