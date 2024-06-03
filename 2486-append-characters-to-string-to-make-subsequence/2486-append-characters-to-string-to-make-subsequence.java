class Solution {
    public int appendCharacters(String s, String t) {
        int j = 0; // Pointer for t

        // Traverse s and try to match characters with t
        for (int i = 0; i < s.length() && j < t.length(); i++) {
            if (s.charAt(i) == t.charAt(j)) {
                j++; // Move pointer for t if characters match
            }
        }

        // The characters in t that haven't been matched need to be appended
        return t.length() - j;
    }
}
