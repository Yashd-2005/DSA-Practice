// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int num=nums[0];
//         for(int i=1; i<nums.length;i++){
//             num^=nums[i];
//         }
//         return num;
//     }
// }
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        int ans=0;
        if(nums.length==1) return nums[0];
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid != 0 && mid % 2 == 0 && nums[mid - 1] != nums[mid]){
                ans=mid;
                start = mid + 1;
            }
            else if(mid % 2 != 0 && nums[mid - 1] == nums[mid]){
                start = mid + 1;
            }
            else if(mid != 0 && mid % 2 == 0 && nums[mid - 1] == nums[mid]){
                end = mid - 1;
            }
            else if(mid % 2 != 0 && nums[mid - 1] != nums[mid]){
                end = mid - 1;
            }else{
                break;
            }
        }
        return nums[ans];
    }
}