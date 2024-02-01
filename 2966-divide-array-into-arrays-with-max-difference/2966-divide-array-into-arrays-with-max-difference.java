import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i += 3) {
            if ((nums[i + 2] - nums[i]) > k) {
                return new int[][]{};
            }
            list.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
        }

        int[][] arr = new int[list.size()][3];

        for (int i = 0; i < list.size(); i++) {
            List<Integer> sublist = list.get(i);
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sublist.get(j);
            }
        }
        return arr;
    }
}
