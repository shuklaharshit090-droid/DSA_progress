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
    public int countNodes(TreeNode root){
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public boolean isComplete(TreeNode root,int index,int target){
        if(root==null) return true;
        if(index>=target) return false;
        return isComplete(root.left,2*index+1,target) && isComplete(root.right,2*index+2,target);
    }
    public boolean isCompleteTree(TreeNode root) {
        if(root==null) return true;
        int count=countNodes(root);
        return isComplete(root,0,count);
    }
}