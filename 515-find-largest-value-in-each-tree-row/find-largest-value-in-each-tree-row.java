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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>qt=new LinkedList<>();
        qt.offer(root);
        while(!qt.isEmpty()){
            int size=qt.size();
            int sum=Integer.MIN_VALUE;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=qt.poll();
                if(temp.left!=null) qt.offer(temp.left);
                if(temp.right!=null) qt.offer(temp.right);
                sum=Math.max(sum,temp.val);
            }
            ans.add(sum);
        }
        return ans;
    }
}