class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int max = 1;
        for (int i = 0; i < s.length(); i++){
            int j = 0;
            while (i + j < s.length() && !s.substring(i, i + j).contains("" + s.charAt(i + j)))
                j++;
            if (j > max)
                max = j;
        }
        return max;
    }
}