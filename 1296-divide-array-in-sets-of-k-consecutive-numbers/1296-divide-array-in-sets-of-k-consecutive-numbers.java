import java.util.Map;
import java.util.TreeMap;

class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;

        // Use TreeMap to store frequencies and keep them sorted
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the keys and form sequences
        for (int num : freqMap.keySet()) {
            int count = freqMap.get(num);
            if (count > 0) {
                // Try to form a sequence of length k starting from num
                for (int i = 0; i < k; i++) {
                    int currentNum = num + i;
                    int currentCount = freqMap.getOrDefault(currentNum, 0);
                    if (currentCount < count) {
                        return false;
                    }
                    freqMap.put(currentNum, currentCount - count);
                }
            }
        }

        return true;
    }
}
