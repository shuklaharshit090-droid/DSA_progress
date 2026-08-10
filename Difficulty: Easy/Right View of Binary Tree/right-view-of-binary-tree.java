/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node>qt=new LinkedList<>();
        qt.offer(root);
        while(!qt.isEmpty())
        {
            int size=qt.size();
            for(int i=0;i<size;i++)
            {
                Node temp=qt.poll();
                if(i==size-1) ans.add(temp.data);
                if(temp.left!=null) qt.offer(temp.left);
                if(temp.right!=null) qt.offer(temp.right);
            }
        }
        return ans;
    }
}