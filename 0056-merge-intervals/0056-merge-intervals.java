class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][2];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int[] interval : intervals) {
            if (interval[0] > current[1]) {
                result.add(current);
                current = interval;
            } else {
                current[1] = Math.max(current[1], interval[1]);
            }
        }

        result.add(current);
        return result.toArray(new int[0][2]);
    }
}