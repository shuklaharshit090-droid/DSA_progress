/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void dfs(Node root,int a,int b,int depth,int arr[])
    {
        if(root==null) return;
        if(root.data==a) arr[0]=depth;
        if(root.data==b) arr[1]=depth;
        dfs(root.left,a,b,depth+1,arr);
        dfs(root.right,a,b,depth+1,arr);
    }
    public Node lowestCommonAncestor(Node root, int p, int q) {
        if(root==null) return null;
        if(root.data==p||root.data==q) return root;
        Node l=lowestCommonAncestor(root.left,p,q);
        Node r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null) return root;
        return(l==null)?r:l;
    }
    public int findDist(Node root, int a, int b) {
        Node t1=lowestCommonAncestor(root,a,b);
        int arr[]=new int[2];
        dfs(t1,a,b,0,arr);
        return arr[0]+arr[1];
    }
}