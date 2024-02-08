import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] countArr = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] finalArr = new int[k];
        
        // Calculate the number of soldiers in each row
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            countArr[i] = count;
        }
        
        // Store the row indices and their corresponding soldier counts in the map
        for (int i = 0; i < m; i++) {
            map.put(i, countArr[i]);
        }
        
        // Sort the count array to find the weakest rows
        Arrays.sort(countArr);
        
        // Populate the final array with the indices of the weakest rows
        for (int i = 0; i < k; i++) {
            for (int num : map.keySet()) {
                if (map.get(num) == countArr[i]) {
                    finalArr[i] = num;
                    map.remove(num); // Remove the used index from the map to avoid duplicates
                    break; // Move to the next weakest row
                }
            }
        }
        
        return finalArr;
    }
}
