class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if((m*n) != original.length) return new int[0][0];

        int[][] arr = new int[m][n];
        int k=0;

        for(int i=0;i<m;i++)
        {
            int [] newarr = new int[n];
            for(int j=0;j<n;j++)
            {
                newarr[j]=original[k++];
            }
            arr[i] = newarr;
        }
        return arr;
    }
}