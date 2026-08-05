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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>qt=new LinkedList<>();
        qt.offer(root);
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
            ans.add(a);
        }
      Collections.reverse(ans);
      return ans;
    }
}