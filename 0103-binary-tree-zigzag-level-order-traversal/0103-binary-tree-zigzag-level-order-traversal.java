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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
        return result;
    }

    Deque<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    boolean flag = false;

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> internal = new ArrayList<>();

        for (int i = 0; i < levelSize; i++) {
            if (!flag) {
                TreeNode currNode = queue.pollFirst();
                internal.add(currNode.val);
                if (currNode.left != null) {
                    queue.offerLast(currNode.left);
                }
                if (currNode.right != null) {
                    queue.offerLast(currNode.right);
                }
            } else {
                TreeNode currNode = queue.pollLast();
                internal.add(currNode.val);
                if (currNode.right != null) {
                    queue.offerFirst(currNode.right);
                }
                if (currNode.left != null) {
                    queue.offerFirst(currNode.left);
                }
            }
        }
    flag = !flag;
    result.add(internal);
}

return result;

    }
}