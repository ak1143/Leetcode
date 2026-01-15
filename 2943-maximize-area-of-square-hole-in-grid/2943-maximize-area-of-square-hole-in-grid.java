class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
       Arrays.sort(hBars);
       Arrays.sort(vBars);
       
       int maxH = findMaxConsiqutive(hBars);
       int maxV = findMaxConsiqutive(vBars);

       int side = Math.min(maxH+1,maxV+1);

       return  side*side;
    }

    int findMaxConsiqutive(int[]arr){
        int countMaxlen =1;
        int count =1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+1==arr[i+1]){
                count++;
                countMaxlen = Math.max(count,countMaxlen);
            }
            else{
                count =1;
            }
        }
        return countMaxlen;
    }
}