class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        char c=chars[0];
        int cnt=0;
        if(chars.length==1) return 1;
        for(char ch:chars){
            if(c==ch) cnt++;
            else {
                sb.append(c);
                 if(cnt>1) sb.append(cnt);
                c=ch;
                cnt=1;
            }
        }

        sb.append(c);
        if(cnt>1) sb.append(cnt);
        char[] ch1= sb.toString().toCharArray();
        for(int i=0;i<sb.length();i++){
            chars[i]=ch1[i];
        }
        return sb.length();
    }
}