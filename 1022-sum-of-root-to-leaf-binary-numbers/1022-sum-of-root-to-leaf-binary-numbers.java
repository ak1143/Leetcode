/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        helper(root, 0);
        return sum;
    }

    public void helper(TreeNode root, int number) {

        if (root == null) return;

        // Build number using bit manipulation
        number = (number << 1) | root.val;

        // If leaf node → add to sum
        if (root.left == null && root.right == null) {
            sum += number;
            return;
        }

        helper(root.left, number);
        helper(root.right, number);
    }
}