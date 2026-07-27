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
    public void inorder(ArrayList<Integer>ans,TreeNode root)
    {
        if(root==null) return;
       inorder(ans,root.left);
       ans.add(root.val);
       inorder(ans,root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>ans=new ArrayList<>();
        inorder(ans,root);
        if(ans.size()<2) return false;
        for(int i=0;i<ans.size();i++)
        {
            for(int j=i+1;j<ans.size();j++)
            {
                if(ans.get(i)+ans.get(j)==k)
                {
                    return true;
                }
            }
        }
        return false;
    }
}