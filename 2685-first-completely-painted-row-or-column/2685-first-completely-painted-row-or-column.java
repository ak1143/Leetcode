import java.util.HashMap;

class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        // Map to store the positions of elements in the matrix
        HashMap<Integer, int[]> positionMap = new HashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                positionMap.put(mat[i][j], new int[]{i, j});
            }
        }

        int[] rowCount = new int[rows];
        int[] colCount = new int[cols];

        // Process elements in the order of arr
        for (int i = 0; i < arr.length; i++) {
            int[] pos = positionMap.get(arr[i]);
            int r = pos[0];
            int c = pos[1];

            rowCount[r]++;
            colCount[c]++;

            // Check if row or column is fully filled
            if (rowCount[r] == cols || colCount[c] == rows) {
                return i;  // Return the index where completion occurs
            }
        }

        return -1; // No full row/column is completed
    }
}
