/*class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int k=0,h1=0;
        Arrays.sort(piles);
        for(int i=0;i<piles.length;i++){
            h1=i;
            k=piles[i];
            for(int j=i;j<piles.length;j++){
                if(piles[j]%k==0){
                    h1+=piles[j]/k;
                }else{
                    h1+=(piles[j]/k)+1;
                }
            }
            if(h1==h) return k;
        }
        return -1;
    }
}
*
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int h1=0,k=0;
        Arrays.sort(piles);
        int start=0;
        int n= piles.length;
        int mid=0;
        int end=n-1;
        while(start <= end){
            mid=start+(end-start)/2;
            k=piles[mid];
            h1=check(piles,k,mid);

            if(h1<h){
                end=mid-1;
            }
            else if(h1 > h){
                start=mid+1;
            }
            else{
                return k;
            }

        }
        return k;
    }
    public static int check(int[] piles,int k,int i){
        int h1=i;
        for(int j=i;j<piles.length;j++){
            if(piles[j]%k==0){
                h1+=piles[j]/k;
            }else{
                h1+=(piles[j]/k)+1;                
            }
        }    
        return h1;
    }
}
*/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long h1=0,k=0;
        Arrays.sort(piles);
        int start=1;
        int n= piles.length;
        int mid=0;
        int end=piles[n-1];
        while(start <= end){
            mid=start+(end-start)/2;
            k=mid;
            h1=check(piles,mid);

            if(h1<=h){
                end=mid-1;
            }
            else if(h1 > h){
                start=mid+1;
            }
           
        }
        return start;
    }
    public static long check(int[] piles,int k){
        long h1=0;
        for(int j=0;j<piles.length;j++){
            if(piles[j]<k) {
                h1+=1;
                continue;
            }
            if(piles[j]%k==0){
                h1+=piles[j]/k;
            }else{
                h1+=(piles[j]/k)+1;                
            }
        }    
        return h1;
    }
}