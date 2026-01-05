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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for(int i:to_delete){
            set.add(i);
        }

        deleteHelper(root,result,set);

        if(!set.contains(root.val)){
            result.add(root);
        }
        return result;
    }

    TreeNode deleteHelper(TreeNode root,List<TreeNode> result,Set<Integer> set){
        if(root==null) return null;

        root.left = deleteHelper(root.left,result,set);
        root.right = deleteHelper(root.right,result,set);

        if(set.contains(root.val)){
            if(root.left!=null) result.add(root.left);
            if(root.right!=null) result.add(root.right);
            return null;
        }else{
            return root;
        }
    }
}