class Solution {
    public int maximumLengthSubstring(String s) {
        int length=0;
        int maxLength=0;
        int j=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index = ch - 'a';
            freq[index] ++ ;
            while(freq[index]>2){
                freq[s.charAt(j)-'a']--;
                j++;
            }
            maxLength=Math.max(maxLength,i-j+1);
        }
       return  maxLength;
    }
}