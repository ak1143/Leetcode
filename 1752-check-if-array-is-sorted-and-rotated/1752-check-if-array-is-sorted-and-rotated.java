class Solution {
    public boolean check(int[] nums) {
        int count =0;
        int i=0;
        boolean ans = nums[i] >= nums[nums.length-1] ? true : false;
        while(i<nums.length-1){
            if (nums[i]>nums[i+1]) count++;
            i++;
        }
        return count>1 ? false : count == 0 ? true : ans;
    }
}