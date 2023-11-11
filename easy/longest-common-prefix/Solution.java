class Solution {
    public String longestCommonPrefix(String[] strs) {
        // start with first value as prefix
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++){
            // remove chars from prefix until no prefix matches
            while (prefix.length() > 0){
                // if prefix matches then don't proceed
                if (strs[i].startsWith(prefix))
                    break;
                // remove char from prefix and try again
                prefix = prefix.substring(0, prefix.length()-1);
            }
            // if no prefix then return
            if (prefix.length() == 0)
                return "";
        }
        return prefix;
    }
}