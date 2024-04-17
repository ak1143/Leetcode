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
    public String smallestFromLeaf(TreeNode root) {
        String smallest="";
        
        ArrayList<Integer>list=new ArrayList<>();
        List<List<Integer>>output=new ArrayList<>();
        
        traversal(root,list,output);
        
        for(List<Integer>l:output)
        {
            StringBuilder ab=new StringBuilder();
            for(Integer i:l)
            {
                char ch=(char)('a'+i);
                ab.append(ch);
            }
            String str=ab.reverse().toString();
            
            if(smallest.equals(""))
            {
                smallest=str;
            }
            if(smallest.compareTo(str)>0)
            {
                smallest=str;
            }
        }
        return smallest;
    }
    public void traversal(TreeNode node, ArrayList<Integer>list,List<List<Integer>>output)
    {
        if(node==null) return;
        
        list.add(node.val);
        
        if(node.left==null && node.right==null)
        {
            output.add(new ArrayList(list));
            return;
        }
        
        traversal(node.left,new ArrayList(list),output);
        traversal(node.right,new ArrayList(list),output);
    }
}




