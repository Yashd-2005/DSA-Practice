class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=1;
        int count=1;
        while (j < nums.length) {
            if (nums[j]==nums[j-1] && count<2) {
                nums[i]=nums[j];
                i++;
                j++;
                count++;
            }
            else if (nums[j]==nums[j - 1] && count>=2) {
                while (j<nums.length && nums[j]==nums[j - 1]) {
                    j++;
                }
                if (j < nums.length) {
                    nums[i]=nums[j];
                    i++;
                    j++;
                }
                count=1;
            }
            else {
                nums[i]=nums[j];
                i++;
                j++;
                count=1;
            }
        } 
          return i;
    }
}