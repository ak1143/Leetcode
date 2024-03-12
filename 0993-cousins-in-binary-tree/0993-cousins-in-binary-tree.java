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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (level(root, x, 0) == level(root, y, 0) && !isSibling(root, x, y));
    }

    private TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }

        if (node.val == x) {
            return node;
        }

        TreeNode leftNode = findNode(node.left, x);
        if (leftNode != null) {
            return leftNode;
        }

        return findNode(node.right, x);
    }

    private int level(TreeNode node, int x, int lev) {
        if (node == null) {
            return 0;
        }

        if (node.val == x) {
            return lev;
        }

        int leftLevel = level(node.left, x, lev + 1);
        if (leftLevel != 0) {
            return leftLevel;
        }
        return level(node.right, x, lev + 1);
    }

    private boolean isSibling(TreeNode node, int x, int y) {
        if (node == null) {
            return false;
        }

        boolean isLeftX = (node.left != null && node.left.val == x);
        boolean isRightX = (node.right != null && node.right.val == x);
        boolean isLeftY = (node.left != null && node.left.val == y);
        boolean isRightY = (node.right != null && node.right.val == y);

        return (isLeftX && isRightY) || (isRightX && isLeftY)
                || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}
