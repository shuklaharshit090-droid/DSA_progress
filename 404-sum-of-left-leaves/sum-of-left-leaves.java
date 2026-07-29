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
    public int sumOfLeftLeaves(TreeNode root) {
        int ans=0;
        Queue<TreeNode>qt=new LinkedList<>();
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        qt.add(root);
        while(qt.size()!=0)
        {
         TreeNode t=qt.poll();
         if(t.left!=null)
         {
            if(t.left.left==null && t.left.right==null)
            {
              ans+=t.left.val;
            }
            else{
                qt.add(t.left);
            }
         }
         if(t.right!=null)
         {
            qt.add(t.right);
         }
         }
        
        return ans;
    }
}