class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int sum =0;
        while(i<j){
            int currentSum = nums[i]+nums[j];
            sum = Math.max(currentSum,sum);
            i++;
            j--;
        }
        return sum;
    }
}