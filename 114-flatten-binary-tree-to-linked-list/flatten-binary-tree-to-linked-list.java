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
    public void dfs(ArrayList<TreeNode>ans,TreeNode root)
    {
        if(root==null) return;
        ans.add(root);
        dfs(ans,root.left);
        dfs(ans,root.right);
    }
    public void flatten(TreeNode root) {
        ArrayList<TreeNode>ans=new ArrayList<>();
        if(root==null) return;
         dfs(ans,root);
        for(int i=0;i<ans.size()-1;i++)
        {
          ans.get(i).right=ans.get(i+1);
          ans.get(i).left=null;
        }
        ans.get(ans.size()-1).right=null;
        ans.get(ans.size()-1).left=null;
    }
}