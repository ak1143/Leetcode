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
    public boolean isCompleteTree(TreeNode root) {
        int totalNodes = CountNodes(root);

        int i=1;
        return dfs(root,i,totalNodes);
    }

    int CountNodes(TreeNode node){
        if(node==null) return 0;
        return 1+CountNodes(node.left)+CountNodes(node.right);
    }
    boolean dfs(TreeNode root,int i,int totalNodes){
        if(root==null) return true;

        if(i>totalNodes) return false;

        return dfs(root.left,2*i,totalNodes) && dfs(root.right,2*i+1,totalNodes);
    }
}