/* Structure of Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public void preorder(ArrayList<Integer>ans,Node root)
    {
        if(root==null) return;
        ans.add(root.data);
        preorder(ans,root.left);
        preorder(ans,root.right);
    }
    public ArrayList<Integer> preOrder(Node root) {
       ArrayList<Integer>ans =new ArrayList<>();
       preorder(ans,root);
       return ans;
    }
}