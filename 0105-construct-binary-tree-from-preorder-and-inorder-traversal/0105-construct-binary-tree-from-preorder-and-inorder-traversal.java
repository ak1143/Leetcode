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

    int preIndex = 0;
    HashMap<Integer,Integer>map = new HashMap<>();

    public TreeNode buildTree(int[] pre, int[] in) {
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        return helper(pre,0,pre.length-1);
    }

    TreeNode helper(int[]pre, int start, int end){

        if(start>end) return null;

        int nodeval = pre[preIndex++];
        TreeNode node = new TreeNode(nodeval);

        int ind = map.get(nodeval);

        node.left = helper(pre,start, ind-1);
        node.right = helper(pre, ind+1, end);

        return node;
    }

}