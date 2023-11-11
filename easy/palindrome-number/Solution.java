class Solution {
    public boolean isPalindrome(int x) {
        // negative cannot be a palindrome
        if (x < 0) return false;
        // create a reversed version of the number
        int reversed = 0;
        int temp = x;
        while (temp > 0){
            int digit = temp % 10;
            reversed *= 10;
            reversed += digit;
            temp /= 10;
        }
        // compare reversed and original
        return reversed == x;
    }
}