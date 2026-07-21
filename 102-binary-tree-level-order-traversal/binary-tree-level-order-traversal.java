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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>qt=new LinkedList<>();
        if(root==null) return ans;
        qt.add(root);
        while(qt.size()!=0)
        {
            int len=qt.size();
            List<Integer>a=new ArrayList<>();
            for(int i=0;i<len;i++)
            {
                TreeNode curr=qt.poll();
                if(curr.left!=null) qt.add(curr.left);
                if(curr.right!=null) qt.add(curr.right);
            a.add(curr.val);
            }
            ans.add(a);
        }
        return ans;
    }
}