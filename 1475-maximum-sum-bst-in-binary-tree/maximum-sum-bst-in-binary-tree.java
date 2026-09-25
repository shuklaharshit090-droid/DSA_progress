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
 public class Quad{
    int min;
    int max;
    boolean bst;
    int sum;
    Quad(int min,int max,boolean bst,int sum){
        this.min=min;
        this.max=max;
        this.bst=bst;
        this.sum=sum;
    }
 }
class Solution {
    int maxsum=0;
    public Quad minmaxsum(TreeNode root){
        if(root==null) return new Quad(Integer.MAX_VALUE,Integer.MIN_VALUE,true,0);
        Quad lst=minmaxsum(root.left);
        Quad rst=minmaxsum(root.right);
        int min=Math.min(root.val,Math.min(lst.min,rst.min));
        int max=Math.max(root.val,Math.max(lst.max,rst.max));
        boolean bst=lst.bst && rst.bst && root.val>lst.max && root.val<rst.min;
        int sum=lst.sum+rst.sum+root.val;
        if(bst){
            maxsum=Math.max(maxsum,sum);
        }
        return new Quad(min,max,bst,sum);
    }
    public int maxSumBST(TreeNode root) {
        minmaxsum(root);
        return maxsum;
    }
}