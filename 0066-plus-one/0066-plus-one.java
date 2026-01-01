class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        if(digits[n]!=9){
            digits[n]= digits[n]+1;
            return digits;
        }

        if(allNines(digits)){
            int []arr = new int[n+2];
            arr[0] = 1;
            return arr;
        }

        int i=n;

        while(digits[i]==9 && i>=0){
            digits[i]=0;
            i--;
        }
        digits[i] = digits[i]+1;
        return digits;

    }
    public boolean allNines(int[]arr){
        for(int i:arr){
            if(i!=9) return false;
        }
        return true;
    }
}