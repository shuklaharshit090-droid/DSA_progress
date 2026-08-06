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
    public void nthlevel(List<Integer>a,TreeNode root,int n)
    {
        if(root==null) return;
        if(n==0){
            a.add(root.val);
            return;
        }
        nthlevel(a,root.left,n-1);
        nthlevel(a,root.right,n-1);
    }
    public void nthlevel2(List<Integer>a,TreeNode root,int n)
    {
        if(root==null) return;
        if(n==0){
            a.add(root.val);
            return;
        }
        nthlevel2(a,root.right,n-1);
        nthlevel2(a,root.left,n-1);
    }
    public int height(TreeNode root)
    {
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        int level=height(root);
        for(int i=0;i<level;i++)
        {
            List<Integer>a=new ArrayList<>();
            if(i%2==0)
            {
                nthlevel(a,root,i);
            }
            else{
                nthlevel2(a,root,i);
            }
            ans.add(a);
        }
        return ans;
    }
}