
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return sub(new ArrayList<>(), nums);
    }

    List<List<Integer>> sub(List<Integer> inner, int[] arr) {
        if (arr.length == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(inner);
            return list;
        }

        int digit = arr[0];

        List<List<Integer>> left = sub(inner, Arrays.copyOfRange(arr, 1, arr.length));

        List<List<Integer>> right = sub(new ArrayList<>(inner), Arrays.copyOfRange(arr, 1, arr.length));
        for (List<Integer> l : right) {
            l.add(digit);
        }

        left.addAll(right);

        return left;
    }
}
