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
    public class pair{
        TreeNode node;
        int cn;
        pair(TreeNode node,int cn)
        {
            this.node=node;
            this.cn=cn;
        }
    }
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        int sum=0;
        // int cn=0;
        Stack<pair>st=new Stack<>();
        pair val=new pair(root,0);
        st.push(val);
        while(!st.isEmpty())
        {
            pair a=st.pop();
            TreeNode node=a.node;
            int cn=a.cn;
            cn=cn*10+node.val;
            if(node.left==null && node.right==null)
            {
                sum+=cn;
            }
            if(node.left!=null) st.push(new pair(node.left,cn));
            if(node.right!=null) st.push(new pair(node.right,cn));
        }
        return sum;
    }
}