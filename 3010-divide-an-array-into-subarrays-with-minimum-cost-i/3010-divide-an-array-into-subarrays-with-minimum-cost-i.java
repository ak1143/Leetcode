class Solution {
    public int minimumCost(int[] nums) {
        int sum = nums[0];
        Arrays.sort(nums);
        if(nums[0]==sum){
            sum += nums[1]+nums[2];
            return sum;
        }else if(nums[1]==sum){
                return sum += nums[0]+nums[2];
            }
        return sum+=nums[0]+nums[1];
    }
}