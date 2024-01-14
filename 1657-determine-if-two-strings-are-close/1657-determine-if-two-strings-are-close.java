import java.util.HashMap;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < word1.length(); i++) {
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);

            map1.put(c1, map1.getOrDefault(c1, 0) + 1);
            map2.put(c2, map2.getOrDefault(c2, 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        HashMap<Integer, Integer> freq1 = new HashMap<>();
        HashMap<Integer, Integer> freq2 = new HashMap<>();

        for (int count : map1.values()) {
            freq1.put(count, freq1.getOrDefault(count, 0) + 1);
        }

        for (int count : map2.values()) {
            freq2.put(count, freq2.getOrDefault(count, 0) + 1);
        }

        return freq1.equals(freq2);
    }
}
