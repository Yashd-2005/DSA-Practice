class Solution {
    public boolean isPalindrome(String s) {
        // StringBuilder sb=new StringBuilder();
        // for(char ch:s.toCharArray()){
        //     if(Character.isLetterOrDigit(ch)){
        //         sb.append(Character.toLowerCase(ch));
        //     }
        // }

        // if(sb.toString().equals(sb.reverse().toString())) return true;
        
        // return false;
        int i=0,j=s.length()-1;

        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                 continue;
            }
            if(!((Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))))){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}