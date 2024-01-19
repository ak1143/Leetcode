class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) {
            return ranges;  
        }

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                ranges.add(formatRange(start, nums[i - 1]));
                start = nums[i];
            }
        }
        ranges.add(formatRange(start, nums[nums.length - 1]));

        return ranges;
    }

    private String formatRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }
}
