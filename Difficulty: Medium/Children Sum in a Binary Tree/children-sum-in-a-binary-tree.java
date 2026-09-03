/* Node Structure
class Node{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
} */
class Solution {
    public int sumtree(Node root)
    {
        if(root==null) return 0;
        int sum=0;
        if(root.left!=null) sum+=root.left.data;
        if(root.right!=null) sum+=root.right.data;
        if(root.left==null && root.right==null) sum+=root.data;
        return sum;
    }
    public boolean isSumProperty(Node root) {
        if(root==null) return true;
        if(sumtree(root)!=root.data) return false;
        boolean lst=isSumProperty(root.left);
        boolean rst=isSumProperty(root.right);
        return (lst && rst);
    }
}