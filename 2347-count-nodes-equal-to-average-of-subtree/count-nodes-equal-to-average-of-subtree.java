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
    int countNodes=0;
    public int[] dfs(TreeNode root)
    {
        if(root==null) return new int[]{0,0};
        int left[]=dfs(root.left);
        int right[]=dfs(root.right);
        int sum=left[0]+right[0]+root.val;
        int count=left[1]+right[1]+1;
        int average=sum/count;
        if(root.val==average) countNodes++;
        return new int[] {sum,count};
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return countNodes;
    }
}