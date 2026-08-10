/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static void view(Node root,int level,ArrayList<Integer>ans)
        {
            if(root==null) return;
            if(level>=ans.size()) ans.add(root.data);
//            else ans.set(level,root.val);
            view(root.left,level+1,ans);
            view(root.right,level+1,ans);
        }
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
            view(root,0,ans);
            return ans;
    }
}