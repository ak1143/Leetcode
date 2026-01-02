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

    public TreeNode buildTree(int[] pre, int[] in) {
        return helper(pre,in,0,pre.length-1);
    }

    TreeNode helper(int[]pre,int[]in, int start, int end){

        if(start>end) return null;

        int nodeval = pre[preIndex++];
        TreeNode node = new TreeNode(nodeval);

        int ind = Integer.MIN_VALUE;

        for(int i=0;i<in.length;i++){
            if(nodeval == in[i]) ind = i;
        }

        node.left = helper(pre,in,start, ind-1);
        node.right = helper(pre,in, ind+1, end);

        return node;
    }

}