class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return subarrayssWithKDistinct(nums, k) - subarrayssWithKDistinct(nums, k - 1);
    }

    private int subarrayssWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[n + 1];
        int left = 0;
        int right = 0;
        int res = 0;
        while (right < n) {
            if (count[nums[right]] == 0) {
                k--;
            }
            count[nums[right]]++;
            while (k < 0) {
                count[nums[left]]--;
                if (count[nums[left]] == 0) {
                    k++;
                }
                left++;
            }
            res += right - left + 1;
            right++;
        }
        return res;
    }
}