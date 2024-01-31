
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] result = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i % n] >= st.peek()) {
                st.pop();
            }
            if (st.isEmpty()) {
                result[i % n] = -1;
            } else {
                result[i % n] = st.peek();
            }
            st.push(nums[i % n]);
        }

        return result;
    }
}
