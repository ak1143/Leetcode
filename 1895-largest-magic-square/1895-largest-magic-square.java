class Solution {
    public int largestMagicSquare(int[][] grid) {

        // prefix sum example

        int rows = grid.length;
        int cols = grid[0].length;

        // cumulative sum of rows
        int[][] rowSum = new int[rows][cols];
     
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++) {
                sum += grid[i][j];
                rowSum[i][j] = sum;
            }
        }

        // cumulative sum of cols
        int[][] colSum = new int[rows][cols];

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += grid[i][j];
                colSum[i][j] = sum;
            }
        }

        // start checking magical square from max length.
        for(int side = Math.min(rows,cols) ; side>=2 ; side--){

            // in order to check the magial square we have to go through each cell
            for(int i=0; i+side-1< rows; i++){
                for(int j=0;j+side-1< cols; j++){

                    int targetSum = rowSum[i][j+side-1] - (j>0 ? rowSum[i][j-1] : 0);

                    boolean allSame = true;

                    // check rows
                    for(int r=i+1; r<i+side; r++ ){
                        int rowsum = rowSum[r][j+side-1] - (j>0 ? rowSum[r][j-1] : 0);

                        if(rowsum != targetSum){
                            allSame = false;
                            break;
                        }
                    }

                    if(!allSame) 
                        continue;

                    // check cols
                    for(int c=j; c<j+side; c++){
                        int colsum = colSum[i+side-1][c] - (i>0 ? colSum[i-1][c] : 0);

                        if(colsum != targetSum){
                            allSame = false;
                            break;
                        }
                    }
                    
                    if(!allSame) 
                        continue;

                    // check diagonals
                    int diag = 0, antiDiag = 0;
                    for (int k = 0; k < side; k++) {
                        diag += grid[i + k][j + k];
                        antiDiag += grid[i + k][j + side - 1 - k];
                    }

                    if (diag == targetSum && antiDiag == targetSum)
                        return side;

                }
            }
        }
        return 1;

    }
}