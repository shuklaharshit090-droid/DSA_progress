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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>qt=new LinkedList<>();
        qt.offer(root);
        int c=0;
        while(!qt.isEmpty())
        {
            int size=qt.size();  
            List<Integer>a=new ArrayList<>();  
            for(int i=0;i<size;i++)
            {
                TreeNode temp=qt.poll();
                a.add(temp.val);
                if(temp.left!=null) qt.offer(temp.left);
                if(temp.right!=null) qt.offer(temp.right);
            }
            if(c%2!=0)
            {
                Collections.reverse(a);
            }
            ans.add(a);
            c++;
        }
        return ans;
    }
}