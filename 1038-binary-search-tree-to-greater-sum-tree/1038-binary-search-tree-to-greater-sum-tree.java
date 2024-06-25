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
    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }
        int[] sum = new int[1]; // Use an array to pass by reference
        helper(root, sum);
        return root;
    }

    private void helper(TreeNode root, int[] sum) {
        if (root == null) {
            return;
        }
        // Traverse the right subtree first
        helper(root.right, sum);
        // Update the value of the current node
        sum[0] += root.val;
        root.val = sum[0];
        // Traverse the left subtree
        helper(root.left, sum);
    }
}