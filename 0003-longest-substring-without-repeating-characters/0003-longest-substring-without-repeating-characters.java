class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;

        while (j < n) {
            if (!map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), j);
            } else {
                maxLength = Math.max(maxLength, j - i);
                i = Math.max(i, map.get(s.charAt(j)) + 1);
                map.put(s.charAt(j), j);
            }
            j++;
        }
        maxLength = Math.max(maxLength, j - i); // Handle the case when the longest substring ends at the end of the string.
        return maxLength;
    }
}
