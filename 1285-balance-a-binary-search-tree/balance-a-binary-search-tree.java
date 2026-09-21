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
    public void inorder(TreeNode root,ArrayList<Integer>arr)
    {
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode tobst(ArrayList<Integer>arr,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        TreeNode node=new TreeNode(arr.get(mid));
        node.left=tobst(arr,low,mid-1);
        node.right=tobst(arr,mid+1,high);
        return node;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer>arr=new ArrayList<>();
        inorder(root,arr);
        return tobst(arr,0,arr.size()-1);
    }
}