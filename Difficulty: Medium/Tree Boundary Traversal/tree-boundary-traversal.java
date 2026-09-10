/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    boolean isLeaf(Node root)
    {
        if(root.left==null && root.right==null) return true;
        return false;
    }
    void collectleft(Node root,ArrayList<Integer>ans)
    {
        if(root==null || isLeaf(root)) return;
        ans.add(root.data);
        if(root.left!=null)
        {
            collectleft(root.left,ans);
        }
        else if(root.right!=null)
        {
            collectleft(root.right,ans);
        }
    }
    void collectleaf(Node root,ArrayList<Integer>ans)
    {
        if(root==null) return;
        if(isLeaf(root)) 
        {
            ans.add(root.data);
            return;
        }
        collectleaf(root.left,ans);
        collectleaf(root.right,ans);
    }
    void collectright(Node root,ArrayList<Integer>ans)
    {
        if(root==null || isLeaf(root)) return;
        if(root.right!=null)
        {
            collectright(root.right,ans);
        }
        else if(root.left!=null)
        {
            collectright(root.left,ans);
        }
        ans.add(root.data);
    }
    public ArrayList<Integer> boundaryTraversal(Node root) {
     ArrayList<Integer>ans=new ArrayList<>();
     if(root==null) return ans;
    if(!isLeaf(root)) ans.add(root.data);
     collectleft(root.left,ans);
     collectleaf(root,ans);
     collectright(root.right,ans);
     return ans;
    }
}