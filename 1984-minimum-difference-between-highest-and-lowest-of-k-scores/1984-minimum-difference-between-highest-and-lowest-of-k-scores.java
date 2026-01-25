class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;

        if(n==1) return 0;

        Arrays.sort(nums);

        int low = 0,high =k-1, minDiff=Integer.MAX_VALUE;

        while(high < n){

            // if(high - low + 1 >k){
            //     low++;
            // }

            int diff = nums[high] - nums[low];
            minDiff = Math.min(diff,minDiff);

            high++;
            low++;

        }
        return minDiff;
    }
}