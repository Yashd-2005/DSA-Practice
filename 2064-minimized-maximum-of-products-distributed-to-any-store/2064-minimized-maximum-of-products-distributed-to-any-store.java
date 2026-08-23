class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int start=1;
        int max=Integer.MIN_VALUE;
        for(int q:quantities){
            max=Math.max(max,q);
        }
        int end=max;
        int mid=0;
        int ans=0;

        
        while(start<=end){
            mid=start+(end-start)/2;
            int n1=canAllocate(quantities,mid,n);
            
            if(n1>n){
                start=mid+1;            
            }
            else{
               ans=mid;
            end=mid-1;
            }
        }
        return ans;
    }
    public int canAllocate(int[] quantities,int mid,int n){
        int amt=0;

        for(int q : quantities ){
            if(q % mid !=0){
                amt+=(q/mid)+1;
            }
            else{
                amt+=(q/mid);
            }
        }
        
        return amt;
    }
}