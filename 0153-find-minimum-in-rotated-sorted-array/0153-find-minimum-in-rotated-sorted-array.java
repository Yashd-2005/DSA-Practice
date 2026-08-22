class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int min=nums[0];
        if(nums.length==1){
            return nums[0];
        }
        if(nums[start]  < nums[end]) return nums[start];

        while(start<=end){
            mid=start+(end-start)/2;
             if(nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            else if(nums[mid] <nums[mid+1] && nums[mid] >= nums[start]){
                start=mid+1;
                
            }
            else if(nums[mid] <nums[mid+1] && nums[mid] <= nums[start]){
                end=mid-1;
                
            }
        }
        return min;
    }
}