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
    public int amountOfTime(TreeNode root, int start) {
        if(root==null) return 0;
        HashMap<TreeNode,TreeNode>map=new HashMap<>();
        map.put(root,null);
        Queue<TreeNode>qt=new LinkedList<>();
        qt.add(root);
        TreeNode target=null;
        while(!qt.isEmpty())
        {
          TreeNode t=qt.poll();
          if(t.val==start){
            target=t;
          }
          if(t.left!=null){
           map.put(t.left,t);
           qt.add(t.left);
          }
          if(t.right!=null){
           map.put(t.right,t);
           qt.add(t.right);
          } 
        }
        Map<TreeNode,Boolean>visited=new HashMap<>();
        qt.add(target);
        int ans=-1;
        while(!qt.isEmpty())
        {
            int size=qt.size();
            while(size-->0){
             TreeNode curr=qt.poll();
             visited.put(curr,true);
             if(curr.left!=null && !visited.containsKey(curr.left)) qt.add(curr.left);
             if(curr.right!=null && !visited.containsKey(curr.right)) qt.add(curr.right);
             if(map.get(curr)!=null && !visited.containsKey(map.get(curr))) qt.add(map.get(curr));
            }
            ans++;
        }
        return ans;
    }
}