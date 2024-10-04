// class Solution {
//     public long dividePlayers(int[] skill) {
//         Arrays.sort(skill);
//         int n= skill.length-1;
//         int prevsum = skill[0]-skill[n];
//         int prevprod = skill[0]*skill[n];
//         int ans = prevprod;
//         int i=1;
//         int j=n-1;
//         while(i<j){
//             int sum = skill[i] + skill[j];
//             int prod = skill[i] * skill[j];
//             if(prevsum != sum) return -1;
//             ans += prod;
//             i++;
//             j--;
//         }
//         return ans;
//     }
// }

import java.util.Arrays;

class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill); // Sort the skill array
        int n = skill.length - 1; // Index of the last element

        // Initialize prevsum with the sum of the first and last skill
        int prevsum = skill[0] + skill[n];

        // Initialize the result (ans) with the product of the first and last skills
        long ans = (long) skill[0] * skill[n];

        // Use two pointers to pair players from both ends of the sorted array
        int i = 1;
        int j = n - 1;

        // Loop to process each pair
        while (i < j) {
            // Calculate the sum and product of the current pair
            int sum = skill[i] + skill[j];
            long prod = (long) skill[i] * skill[j]; // Use long to avoid overflow

            // If the sum doesn't match the first pair's sum, return -1
            if (prevsum != sum) {
                return -1;
            }

            // Add the product to the total answer
            ans += prod;

            // Move the pointers inward
            i++;
            j--;
        }

        // Return the total product if all pairs have valid sums
        return ans;
    }
}
