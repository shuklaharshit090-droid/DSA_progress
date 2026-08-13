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
    public void dfs(List<List<Integer>>ans,TreeNode root,int targetSum,int tempsum,List<Integer>a)
    {
        if(root==null) return;
        a.add(root.val);
        tempsum+=root.val;
        // if(tempsum>targetSum)
        // {
        //     a.remove(a.size()-1);
        //     return;
        // }
        if(root.left==null && root.right==null){
            if(tempsum==targetSum){
             ans.add(new ArrayList<>(a));
            }
            a.remove(a.size()-1);
             return;
        }
        dfs(ans,root.left,targetSum,tempsum,a);
        dfs(ans,root.right,targetSum,tempsum,a);
        a.remove(a.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>>ans=new ArrayList<>();
        dfs(ans,root,targetSum,0,new ArrayList<>());
        return ans;
    }
}