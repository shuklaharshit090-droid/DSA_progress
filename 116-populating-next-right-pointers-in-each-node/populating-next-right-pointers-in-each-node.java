/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        ArrayList<ArrayList<Node>>ans=new ArrayList<>();
        if(root==null) return null;
        Queue<Node>qt=new LinkedList<>();
        qt.offer(root);
        while(!qt.isEmpty())
        {
            int size=qt.size();
            ArrayList<Node>a=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node temp=qt.poll();
                if(temp.left!=null) qt.offer(temp.left);
                if(temp.right!=null) qt.offer(temp.right);
                a.add(temp);
            }
            ans.add(a);
        }
        for(ArrayList<Node> t:ans)
        {
            int size=t.size();
            for(int i=0;i<size;i++)
            {
                if(i>=0 && i<size-1){
                t.get(i).next=t.get(i+1);
            }
               if(i==size-1)
               {
                t.get(i).next=null;
               }
            }
        }
        return root;
    }
}