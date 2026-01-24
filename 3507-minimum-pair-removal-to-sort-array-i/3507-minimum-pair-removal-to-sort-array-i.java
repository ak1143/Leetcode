class Solution {
    boolean isSorted(int[]arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    int minSumPairIndex(int []arr){
        int index = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            int sum = arr[i] + arr[i+1];
            if(sum<minSum){
                minSum = sum;
                index = i;
            }
        }
        return index;
    }
    // Replace pair at index with their sum
    int[] merge(int[] arr, int idx) {
        int[] res = new int[arr.length - 1];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == idx) {
                res[k++] = arr[i] + arr[i + 1];
                i++; // skip next element
            } else {
                res[k++] = arr[i];
            }
        }
        return res;
    }
    public int minimumPairRemoval(int[] nums) {
        int count =0;
        while(!isSorted(nums)){
            int ind = minSumPairIndex(nums);
            nums = merge(nums,ind);
            count++;
        }
        return count;
    }
}