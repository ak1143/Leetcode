class Solution {
    public int longestPalindrome(String s) {
        // Use an array of size 128 to cover all ASCII characters
        int[] charCount = new int[128];
        int length = 0;
        
        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
        }
        
        boolean hasOdd = false;
        
        // Calculate the maximum length of the palindrome
        for (int count : charCount) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1; // Add the even part of the odd count
                hasOdd = true;       // Mark that there is at least one character with an odd count
            }
        }
        
        // If there is at least one character with an odd count, we can place exactly one of them in the middle
        if (hasOdd) {
            length += 1;
        }
        
        return length;
    }
}
