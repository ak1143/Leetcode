// 2 pointer.

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        int i=0;
        int j=0;
        int n = nums.length;

        int sum =0;

        while(j<n){
            sum+= nums[j];
            while(sum>=target){
                minLength = Math.min(minLength,Math.abs(j-i+1));
                sum -= nums[i];
                i++;
            }
            j++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}