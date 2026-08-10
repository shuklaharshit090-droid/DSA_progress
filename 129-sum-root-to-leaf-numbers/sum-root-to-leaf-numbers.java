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
    int ans=0;
    public void helper(TreeNode root,int finalans)
    {
        if(root==null) return;
        finalans=finalans*10+root.val;
        if(root.left==null && root.right==null) {
            ans=ans+finalans;
            return;
        }
        // ans=ans*10+root.val;
        helper(root.left,finalans);
        helper(root.right,finalans);
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        helper(root,0);
        return ans;
    }
}