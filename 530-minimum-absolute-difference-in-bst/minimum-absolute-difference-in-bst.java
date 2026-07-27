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
    public void inorder(ArrayList<Integer>ans,TreeNode root)
    {
        if(root==null) return;
        inorder(ans,root.left);
        ans.add(root.val);
        inorder(ans,root.right);
    }
    public int getMinimumDifference(TreeNode root) {
     ArrayList<Integer>ans=new ArrayList<>();
     inorder(ans,root);
     int sm=Integer.MAX_VALUE;
     for(int i=0;i<ans.size()-1;i++)   
     {
       int diff=ans.get(i+1)-ans.get(i);
       sm=Math.min(sm,diff);
     }
     return sm;
    }
}