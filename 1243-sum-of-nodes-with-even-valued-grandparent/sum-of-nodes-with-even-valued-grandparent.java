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
    public int sumEvenGrandparent(TreeNode root) {
       if(root==null) return 0;
    //    HashMap<TreeNode,TreeNode>map=new HashMap<>();
    int count=0;
       Queue<TreeNode>qt=new LinkedList<>();
       qt.offer(root);
       while(!qt.isEmpty())
       {
        TreeNode temp=qt.poll();
        if(temp.left!=null && temp.left.left!=null && temp.val%2==0) count+=temp.left.left.val;
        if( temp.left!=null && temp.left.right!=null && temp.val%2==0) count+=temp.left.right.val;
        if( temp.right!=null && temp.right.left!=null && temp.val%2==0) count+=temp.right.left.val;
        if( temp.right!=null && temp.right.right!=null && temp.val%2==0) count+=temp.right.right.val;
        if(temp.left!=null) qt.offer(temp.left);
        if(temp.right!=null) qt.offer(temp.right);
       }
    //    int count=0;
    //    for(TreeNode t:map.keySet())
    //    {
    //     count+=t.val;
    //    }
       return count;
    }
}