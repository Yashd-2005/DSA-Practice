class Solution {
    public int maxArea(int[] height) {
        int i=0,n=height.length;
        int j=n-1;
        int area=0;
        int maxArea=0;

        while(i<=j){
            area=Math.min(height[i],height[j])*(j-i);
            if(height[i]<height[j]) i++;
            else j--;

            maxArea=Math.max(area,maxArea);
        }
        return maxArea;
    }
}