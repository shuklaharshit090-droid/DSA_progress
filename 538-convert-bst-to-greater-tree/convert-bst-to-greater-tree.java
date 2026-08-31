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
    void dfs(TreeNode root,ArrayList<TreeNode>arr)
    {
        if(root==null) return;
        dfs(root.left,arr);
        arr.add(root);
        dfs(root.right,arr);
    }
    public TreeNode convertBST(TreeNode root) {
        if(root==null) return root;
        ArrayList<TreeNode>arr=new ArrayList<>();
        dfs(root,arr);
        for(int i=arr.size()-2;i>=0;i--)
        {
            TreeNode temp=arr.get(i);
            temp.val+=arr.get(i+1).val;
        }
        return root;
    }
}