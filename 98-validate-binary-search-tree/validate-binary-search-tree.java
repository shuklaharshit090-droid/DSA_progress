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
    long min=Long.MIN_VALUE;
    long max=Long.MAX_VALUE;
    public boolean helper(TreeNode root,long min,long max)
    {
         if(root==null) return true;
        if(root.val<=min || root.val>=max) return false;
        boolean left= helper(root.left,min,root.val);
        if(left==false){
            return false;
        }
        return helper(root.right,root.val,max);
        // return true;
    }
    public boolean isValidBST(TreeNode root) {
       return helper(root,min,max);
    }
}