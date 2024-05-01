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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        
        if(root==null)
            return list;
        
        return helper(root,list);
    }
    public List<Integer> helper(TreeNode node,List<Integer>list)
    {
        if(node==null)
            return list;
        
        helper(node.left,list);
        helper(node.right,list);
        list.add(node.val);
        return list;
    }
}