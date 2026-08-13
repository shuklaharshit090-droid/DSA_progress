/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
       ArrayList<Integer>ans=new ArrayList<>();
    //   if(root==null) return ans;
       Stack<Node>st=new Stack<>();
       st.push(root);
       while(!st.isEmpty())
       {
           Node temp=st.pop();
           ans.add(temp.data);
           if(temp.left!=null) st.push(temp.left);
           if(temp.right!=null) st.push(temp.right);
       }
       Collections.reverse(ans);
       return ans;
    }
}