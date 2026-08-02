class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int volume=0;
        /*for(int i=1;i<n;i++){
            volume=Math.max(volume,(Math.min(highest,height[i]))*(i-index));
            if(height[i]>highest){
                highest=height[i];
                index=i;
            }
            
        }*/
        while(i<j){
            volume=Math.max(volume,(Math.min(height[i],height[j]))*(j-i));
            if(height[i]>height[j]){
                j--;
            }else{
                i++;
            }
        }

        return volume;
    }
}