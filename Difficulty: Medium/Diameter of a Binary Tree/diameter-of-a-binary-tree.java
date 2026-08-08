/*Structure of binary tree Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
};*/

class Solution {
    public int levels(Node root)
    {
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
    public void dfs(Node root,int ans[])
    {
        if(root==null) return;
        int leftsum=levels(root.left);
        int rightsum=levels(root.right);
        ans[0]=Math.max(1+leftsum+rightsum,ans[0]);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
    public int diameter(Node root) {
       if(root==null) return 0;
       int ans[]={0};
       dfs(root,ans);
       return ans[0]-1;
    }
}