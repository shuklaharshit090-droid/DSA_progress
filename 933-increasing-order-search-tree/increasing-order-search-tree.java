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
    ArrayList<TreeNode>ans=new ArrayList<>();
    public void inorder(TreeNode root)
    {
      if(root==null)return;
      inorder(root.left);
      ans.add(root);
      inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
      TreeNode dummy=new TreeNode(-1);
      TreeNode curr=dummy;
      inorder(root);
      for(TreeNode idx:ans)
      {
        curr.right=idx;
        idx.left=null;
        curr=curr.right;
      }
      return dummy.right;
    }
}