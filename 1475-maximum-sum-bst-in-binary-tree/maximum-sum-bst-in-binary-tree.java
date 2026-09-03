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
 class Quad{
    int max;
    int min;
    int sum;
    boolean isBst;
    Quad(int max,int min,int sum,boolean isBst)
    {
        this.max=max;
        this.min=min;
        this.sum=sum;
        this.isBst=isBst;
    }
 }
class Solution {
    int maxsum=0;
    public Quad maxmin(TreeNode root) {
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lst=maxmin(root.left);
        Quad rst=maxmin(root.right);
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        boolean isBst=lst.isBst && rst.isBst && root.val>lst.max && root.val<rst.min;
        int sum=root.val+lst.sum+rst.sum;
        if(isBst)
        {
          maxsum=Math.max(maxsum,sum);
        }
        return new Quad(max,min,sum,isBst);
    }
    public int maxSumBST(TreeNode root)
        {
            maxmin(root);
            return maxsum;
        }
}