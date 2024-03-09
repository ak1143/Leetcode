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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> result =new ArrayList<>();
        
        if(root==null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty())
        {
            int levelsize = queue.size();
            double ans=0;
            
            for(int i=0;i<levelsize;i++)
            {
                TreeNode currnode = queue.poll();
                ans+=currnode.val;
                if(currnode.left!=null)
                {
                    queue.offer(currnode.left);
                }
                if(currnode.right!=null)
                {
                    queue.offer(currnode.right);
                }
            }
            result.add(ans/levelsize);
        }
        return result;
    }
}