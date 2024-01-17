

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        HashMap<Integer, Boolean> occurrencesMap = new HashMap<>();
        for (int count : map.values()) {
            if (occurrencesMap.containsKey(count)) {
                return false; 
            } else {
                occurrencesMap.put(count, true);
            }
        }

        return true;
    }
}
