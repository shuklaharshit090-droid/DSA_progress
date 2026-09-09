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
    public void dfs(TreeNode root,List<List<Integer>>ans,int targetsum,List<Integer>a,int tempsum)
    {
        if(root==null) return;
        tempsum+=root.val;
        a.add(root.val);
        if(root.left==null && root.right==null)
        {
        if(tempsum==targetsum)
        {
            List<Integer>t=new ArrayList<>(a);
            ans.add(t);
        }
        a.remove(a.size()-1);
        return;
        }
        dfs(root.left,ans,targetsum,a,tempsum);
        dfs(root.right,ans,targetsum,a,tempsum);
        a.remove(a.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        dfs(root,ans,targetSum,new ArrayList<>(),0);
        return ans;
    }
}