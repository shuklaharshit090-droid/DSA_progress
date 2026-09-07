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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root==null) return false;
        Queue<TreeNode>qt=new LinkedList<>();
        // HashMap<TreeNode,TreeNode>map=new HashMap<>();
        // HashMap<TreeNode,Integer>levels=new HashMap<>();
        int level=0;
        qt.offer(root);
        while(!qt.isEmpty())
        {
            int size=qt.size();
            TreeNode parentx=null;
            TreeNode parenty=null;
            for(int i=0;i<size;i++)
            {
            TreeNode temp=qt.poll();
            if(temp.left!=null)
            {
                if(temp.left.val==x) parentx=temp;
                if(temp.left.val==y) parenty=temp;
                qt.offer(temp.left); 
            }
            if(temp.right!=null)
            {
                if(temp.right.val==x) parentx=temp;
                if(temp.right.val==y) parenty=temp;
                qt.offer(temp.right);
            }
            }
            if(parentx!=null && parenty!=null)
            {
                if(parentx==parenty) return false;
                return true;
            }
            if(parentx!=null || parenty!=null) return false;
            level++;
        }
        return false;
    }

    }
