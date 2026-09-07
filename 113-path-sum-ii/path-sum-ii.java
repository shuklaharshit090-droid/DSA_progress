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
    public void dfs(TreeNode root,int targetSum,List<Integer>a,List<List<Integer>>ans,int tempsum)
    {
        if(root==null) return;
        tempsum+=root.val;
        a.add(root.val);
        if(root.left==null && root.right==null)
        {if(tempsum==targetSum)
        {
            List<Integer>t=new ArrayList<>(a);
            ans.add(t);   
        }
        a.remove(a.size()-1);
        return;
        }
        dfs(root.left,targetSum,a,ans,tempsum);
        dfs(root.right,targetSum,a,ans,tempsum);
        a.remove(a.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        dfs(root,targetSum,new ArrayList<>(),ans,0);
        return ans;
    }
}