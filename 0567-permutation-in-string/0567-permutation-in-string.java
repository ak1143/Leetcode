class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s2.length();
        int m = s1.length();

        if (m > n) return false;

        // Create frequency arrays for s1 and the sliding window of s2
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        // Count the frequency of characters in s1
        for (int i = 0; i < m; i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        // Compare initial window
        if (areFrequenciesEqual(s1Freq, s2Freq)) return true;

        // Sliding window
        for (int i = m; i < n; i++) {
            // Add the current character to the window
            s2Freq[s2.charAt(i) - 'a']++;

            // Remove the character that's sliding out of the window
            s2Freq[s2.charAt(i - m) - 'a']--;

            // Check if the current window matches the frequency of s1
            if (areFrequenciesEqual(s1Freq, s2Freq)) return true;
        }

        return false;
    }

    // Helper method to compare frequency arrays
    private boolean areFrequenciesEqual(int[] freq1, int[] freq2) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }
}
