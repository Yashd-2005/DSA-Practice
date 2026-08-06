class Solution {
    public int smallestNumber(int n, int t) {

        while(true){
            if(n<10 && n%t==0) return n;
            else if(n>9 && ((n/10)*(n%10))%t==0) return n;
            else n=n+1;
        }
    }
}