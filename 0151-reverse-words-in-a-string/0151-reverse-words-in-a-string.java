class Solution {
    public String reverseWords(String s) {
        String s1=s.trim().replaceAll("\\s+"," ");
        String[] str=s1.split(" ");
        int n=str.length;
        for(int i=0;i<n/2;i++){
           swap(str,i,n-1-i);
        }
        return String.join(" ",str);
    
    }
    public static void swap(String[] str,int i,int j){
        String temp=str[i];
        str[i]=str[j];
        str[j]=temp;
    }
}