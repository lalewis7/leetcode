class Solution {
    public boolean isValid(String s) {
        /**
         * Iterate over char array, add open brackets to a stack and
         * compare closing brackets with the popped value from the stack.
         */
        Stack<Character> openBrackets = new Stack();
        Map<Character, Character> brackets = new HashMap();
        brackets.put('(', ')');
        brackets.put('{', '}');
        brackets.put('[', ']');
        char[] chars = s.toCharArray();
        for (char c : chars){
            // open brackets
            if (brackets.keySet().contains(c))
                openBrackets.push(c);
            // pop and check
            else if (brackets.values().contains(c)){
                // closing bracket without any open ones
                if (openBrackets.empty())
                    return false;
                char openBracket = openBrackets.pop();
                if (brackets.get(openBracket) != c)
                    return false;
            }
        }
        // success if all open brackets were closed
        return openBrackets.empty();
    }
}