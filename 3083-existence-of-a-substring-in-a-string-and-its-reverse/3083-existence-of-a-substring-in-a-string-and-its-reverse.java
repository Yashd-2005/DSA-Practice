class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb=new StringBuilder(s).reverse();
        String rev=sb.toString();
        if(s.length()==1) return false;
        for(int i=0;i<s.length()-1;i++){
            String  str = s.substring(i,i+2);       

            if(rev.contains(str)) return true;
        }
        return false;

    }
}