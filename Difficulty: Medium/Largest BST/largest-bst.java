/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */
class Quad{
    int min;
    int max;
    int size;
    boolean isbst;
    Quad(int min,int max,int size,boolean isbst)
    {
        this.min=min;
        this.max=max;
        this.size=size;
        this.isbst=isbst;
    }
}
class Solution {
    static int maxsize;
    public int largestBst(Node root) {
        maxsize=0;
        helper(root);
        return maxsize;
    }
     Quad helper(Node root)
    {
        if(root==null) return new Quad(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        Quad lst=helper(root.left);
        Quad rst=helper(root.right);
        int max=Math.max(root.data,Math.max(lst.max,rst.max));
        int min=Math.min(root.data,Math.min(lst.min,rst.min));
        int size=1+lst.size+rst.size;
        boolean isbst=lst.isbst && rst.isbst && (lst.max<root.data) && (rst.min>root.data);
        if(isbst) maxsize=Math.max(size,maxsize);
        return new Quad(min,max,size,isbst);
    }
}