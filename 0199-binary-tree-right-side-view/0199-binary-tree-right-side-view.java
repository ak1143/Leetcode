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
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            
            for(int i=0;i<levelSize;i++){
                
                TreeNode currnode=queue.poll();
                
                if(i==levelSize-1){
                    result.add(currnode.val);
                }
                
                if(currnode.left!=null){
                    queue.offer(currnode.left);
                }
                
                if(currnode.right!=null){
                    queue.offer(currnode.right);
                }
            }
        }
        return result;
    }
}