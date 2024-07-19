import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        // Step 1: Find the minimum elements in each row
        int[] minRow = new int[matrix.length];
        int[] minRowIndices = new int[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            int min_element = Integer.MAX_VALUE;
            int index = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min_element) {
                    index = j;
                    min_element = matrix[i][j];
                }
            }
            minRow[i] = min_element;
            minRowIndices[i] = index;
        }
        
        // Step 2: Check if the minimum element of each row is the maximum element in its column
        for (int i = 0; i < matrix.length; i++) {
            int colIndex = minRowIndices[i];
            int minElement = minRow[i];
            boolean isMax = true;
            
            for (int[] row : matrix) {
                if (row[colIndex] > minElement) {
                    isMax = false;
                    break;
                }
            }
            
            if (isMax) {
                result.add(minElement);
            }
        }
        
        return result;
    }
}
