class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double no=Double.NEGATIVE_INFINITY;
        
        while(i<=nums.length-k)
        {
            int j=i;
            int sum=0;
            while(j < i + k)
            {
                sum+=nums[j];
                j++;
            }
            double curr=(double) sum/k ;
            no=Math.max(curr,no);
            i++;
        }
        return no;
    }
}
// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         int i = 0;
//         double maxAverage = Double.NEGATIVE_INFINITY;

//         while (i <= nums.length - k) {
//             int j = i;
//             int sum = 0;
//             while (j < i + k) { // Adjusted loop condition
//                 sum += nums[j];
//                 j++;
//             }
//             double curr = (double) sum / k;
//             maxAverage = Math.max(curr, maxAverage);
//             i++;
//         }
//         return maxAverage;
//     }
// }
