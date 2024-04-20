import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> groups = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int r2 = i, c2 = j;
                    // Find bottom-right corner of the group
                    while (r2 < m && land[r2][j] == 1) {
                        c2 = j;
                        while (c2 < n && land[r2][c2] == 1) {
                            c2++;
                        }
                        r2++;
                    }
                    r2--;
                    c2--;

                    // Add group coordinates to the result list
                    groups.add(new int[]{i, j, r2, c2});

                    // Mark visited cells as 0
                    for (int r = i; r <= r2; r++) {
                        for (int c = j; c <= c2; c++) {
                            land[r][c] = 0;
                        }
                    }
                }
            }
        }

        // Convert list to 2D array
        int[][] result = new int[groups.size()][4];
        for (int i = 0; i < groups.size(); i++) {
            result[i] = groups.get(i);
        }
        return result;
    }
}
