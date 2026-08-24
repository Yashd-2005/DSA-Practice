class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m=nums1.length;
        int n=nums2.length;
        double sum=0;
        int min=0;
        int l=m+n;
        int i=0,j=0;
        for(int k=0;k<=l/2;k++){
            if(i>=m){
                min=nums2[j];
                j++;
            }else if(j>=n){
                min=nums1[i];
                i++;
            }
            else if(i<m && j<n && nums1[i]<=nums2[j]){
                min=Math.min(nums1[i],nums2[j]);
                i++;
            }else if(i<m && j<n && nums1[i]>=nums2[j]) {
                min=Math.min(nums1[i],nums2[j]);
                j++;
            }
            if(l%2==0 && (k==(l/2)-1 || k==l/2)){
                sum+=min;
            }
            if((l%2)!=0  && k==l/2){
                sum=min;
                return sum;
            }            
        }
        return sum/2;
    }
}