class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean distinct = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i].equals(arr[j])) {
                    distinct = false;
                    break;
                }
            }
            if (distinct) {
                count++;
                if (count == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}
