class Solution {
    public boolean isAnagram(String s, String t) {
        int[] t1=new int[26];        
        int[] t2=new int[26];        
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c2=t.charAt(i);
            t1[ch-'a']++;
            t2[c2-'a']++;
        }
        for(int i=0;i<26;i++){
            if(t1[i]!=t2[i]) return false;
        }
        return true;
    }
}