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
    public void dfs(TreeNode root,ArrayList<TreeNode>ans)
    {
        if(root==null)return;
        ans.add(root);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode>ans=new ArrayList<>();
        dfs(root,ans);
        for(int i=0;i<ans.size()-1;i++)
        {
             ans.get(i).right=ans.get(i+1);
             ans.get(i).left=null;
        }
        ans.get(ans.size()-1).right=null;
        ans.get(ans.size()-1).left=null;
    }
}