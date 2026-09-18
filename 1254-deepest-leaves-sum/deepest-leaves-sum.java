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
    // public int level(TreeNode root)
    // {
    //     if(root==null) return 0;
    //     return 1+Math.max(level(root.left),level(root.right));
    // }
    public int deepestLeavesSum(TreeNode root) {
       if(root==null) return 0;
       Queue<TreeNode>qt=new LinkedList<>();
       qt.offer(root);
       int sum=0;
       while(!qt.isEmpty())
       {
        sum=0;
        int size=qt.size();
            for(int i=0;i<size;i++)
            {
            TreeNode temp=qt.poll();
            sum+=temp.val;
            if(temp.left!=null) qt.offer(temp.left);
            if(temp.right!=null) qt.offer(temp.right);
            }
       } 
       return sum;
    }
}