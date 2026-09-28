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
    long totalsum=0;
    long maxprod=0;
    public long splitter(TreeNode root){
        if(root==null) return 0;
        long leftsum=splitter(root.left);
        long rightsum=splitter(root.right);
        long sum=root.val+leftsum+rightsum;
        maxprod=Math.max(maxprod,sum*(totalsum-sum));
        return sum;
    }
    public void dfs(TreeNode root)
    {
        if(root==null) return;
        dfs(root.left);
        dfs(root.right);
        totalsum+=root.val;
    }
    public int maxProduct(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        splitter(root);
        return (int)(maxprod%1000000007);
    }
}