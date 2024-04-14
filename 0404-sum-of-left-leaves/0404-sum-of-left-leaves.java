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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        return sumOfleftLeaves(root,false);
    }
    public int sumOfleftLeaves(TreeNode root,boolean isleft){
        if(root==null)
            return 0;
        
        if(isleft && root.left==null && root.right==null)
        {
            return root.val;
        }
        
        int leftsum = sumOfleftLeaves(root.left,true);
        int rightsum =sumOfleftLeaves(root.right,false);
        return leftsum+rightsum;
    }
}