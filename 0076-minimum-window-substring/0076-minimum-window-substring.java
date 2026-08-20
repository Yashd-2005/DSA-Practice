// 
class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) return "";

        int[] freq = new int[128];

        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int i = 0;
        int required = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);

            if (freq[ch] > 0) {
                required--;
            }

            freq[ch]--;

            while (required == 0) {

                if (j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    start = i;
                }

                char left = s.charAt(i);

                freq[left]++;

                if (freq[left] > 0) {
                    required++;
                }

                i++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}