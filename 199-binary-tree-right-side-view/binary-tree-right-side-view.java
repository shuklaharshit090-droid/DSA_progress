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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode>qt=new LinkedList<>();
        qt.add(root);
        while(qt.size()!=0)
        {
            int s=qt.size();
            for(int i=0;i<s;i++)
            {
                TreeNode node=qt.poll();
                if(i==s-1)
                {
                    list.add(node.val);
                }
                if(node.left!=null)
                {
                    qt.add(node.left);
                }
                if(node.right!=null)
                {
                    qt.add(node.right);
                }
            }
        }
        return list;
    }
}