class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int result =0;
        for(int i=0;i<grid2.length;i++){
            for(int j=0;j<grid2[i].length;j++){
                if(grid2[i][j]==1){
                    if(isSubIsland(grid1,grid2,i,j)) result++;
                }
            }
        }
        return result;
    }
    boolean isSubIsland(int[][] grid1, int[][] grid2,int i,int j){

        if(i<0 || i>=grid1.length || j<0 || j>=grid1[i].length ||grid2[i][j] ==0){
            return true;
        }

        if(grid1[i][j]==0) return false;

        grid2[i][j] = 0;

        boolean ans = isSubIsland(grid1,grid2,i+1,j);
        boolean and = isSubIsland(grid1,grid2,i-1,j);
        boolean anf = isSubIsland(grid1,grid2,i,j+1);
        boolean ang = isSubIsland(grid1,grid2,i,j-1);

        return ans && and && anf && ang;
    }
}