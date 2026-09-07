/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        Node curr=root;
        Node pred=null;
        while(curr!=null)
        {
            if(curr.left!=null)
            {
                pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                if(pred.right==null)
                {
                    pred.right=curr;
                    curr=curr.left;
                }
                if(pred.right==curr)
                {
                    pred.right=null;
                    ans.add(curr.data);
                    curr=curr.right;
                }
            }
            else{
                ans.add(curr.data);
                curr=curr.right;
            }
        }
        return ans;
    }
}