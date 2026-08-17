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
    public int goodNode=0;
    public void helper(TreeNode root, int temp)
    {
        if(root==null){
         return;
        } 
        if(root.val>=temp)
        {
            goodNode++;
        }
        temp=Math.max(temp,root.val);
        helper(root.left,temp);
        helper(root.right,temp);
    }
    public int goodNodes(TreeNode root) {
        if(root==null) return 0;
        int temp=root.val;
        helper(root,temp);
        return goodNode;
    }
}