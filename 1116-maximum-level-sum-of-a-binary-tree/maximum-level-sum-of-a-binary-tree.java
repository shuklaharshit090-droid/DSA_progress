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
    public int maxLevelSum(TreeNode root) {
        if(root==null) return 0;
        int maxlevelsum=Integer.MIN_VALUE;
        int maxlevel=0;
        int level=1;
        Queue<TreeNode>qt=new LinkedList<>();
        qt.offer(root);
        while(!qt.isEmpty()){
            int size=qt.size();
            int levelsum=0;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=qt.poll();
                if(temp.left!=null) qt.offer(temp.left);
                if(temp.right!=null) qt.offer(temp.right);
                levelsum+=temp.val;
            }
            if(maxlevelsum<levelsum){
                maxlevelsum=levelsum;
                maxlevel=level;
            }
            level++;
        }
        return maxlevel;
    }
}