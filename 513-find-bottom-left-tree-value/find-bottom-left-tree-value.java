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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
        int lastlevelcount=0;
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<TreeNode>qt=new LinkedList<>();
        qt.offer(root);
        while(!qt.isEmpty())
        {
            int size=qt.size();
            lastlevelcount=size;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=qt.poll();
                if(temp.left!=null) qt.offer(temp.left);
                if(temp.right!=null) qt.offer(temp.right);
                ans.add(temp.val);
            }
        }
        return ans.get(ans.size()-lastlevelcount);
    }
}