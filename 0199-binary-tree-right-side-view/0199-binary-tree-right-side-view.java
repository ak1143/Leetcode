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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;

        return helperFun(1,root,result);
    }
    public List<Integer> helperFun(int level,TreeNode node,List<Integer> result){
        if(node==null) return result;
        if(result.size()<level){
            result.add(node.val);
        }
        helperFun(level+1,node.right,result);
        helperFun(level+1,node.left,result);
        return result;
    }
}