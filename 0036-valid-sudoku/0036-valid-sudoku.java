class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0;i < 9;i++){

            boolean[] rowCheck = new boolean[9];

            boolean[] colCheck = new boolean[9];

            boolean[] boxCheck = new boolean[9];

            for(int j = 0;j< 9;j++){

                if(board[i][j] == '.'){

                }
                else if(rowCheck[board[i][j] - '1'])
                    return false;
                else rowCheck[board[i][j] - '1'] = true;

                if(board[j][i] == '.'){

                }
                else if(colCheck[board[j][i] - '1']) return false;
                else colCheck[board[j][i] - '1'] = true;

                int m = i/3*3 + j/3;

                int n = i%3*3 + j%3;

                if(board[m][n] == '.') {
                    
                }
                else if(boxCheck[board[m][n] - '1']) return false;
                else boxCheck[board[m][n] - '1'] = true;
            }
        }
        return true;
    }
    // public boolean isValidSudoku(char[][] board) {
    //     int numrows=board.length;
    //     int numcols=board[0].length;

    //     for(int row=0; row<numrows ; row++){
    //         if(board[row].length!=9)
    //             return false;
    //     }

    //     for(int col=0; col< numcols ; col++){
    //         if(numrows!=9)
    //             return false;
    //     }

    //     int row=0;
    //     int col=0;

    //     for(int i=col+1;i<9;i++){
    //         char b=board[row][col];
    //         if(b==board[row][i] || b>'9')
    //             return false;
    //         col++;
    //         row++;
    //     }
    //     return true;
    // }
}