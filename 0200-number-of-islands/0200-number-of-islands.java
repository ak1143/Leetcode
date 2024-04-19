class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') { 
                    count++;
                    numIslandsHelper(grid, i, j);
                }
            }
        }
        return count;
    }
    
    private void numIslandsHelper(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return;
        }
        
        if (grid[i][j] == '-') {
            return;
        }
        
        grid[i][j] = '-';
        
        numIslandsHelper(grid, i + 1, j);
        numIslandsHelper(grid, i - 1, j);
        numIslandsHelper(grid, i, j + 1);
        numIslandsHelper(grid, i, j - 1);
    }
}
