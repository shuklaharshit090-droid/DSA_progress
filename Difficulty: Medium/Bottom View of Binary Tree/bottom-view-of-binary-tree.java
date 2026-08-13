/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
       ArrayList<Integer>ans=new ArrayList<>();
       if(root==null) return ans;
       Map<Integer,Node>map=new TreeMap<>();
       Queue<Node>qt=new LinkedList<>();
       Queue<Integer>q=new LinkedList<>();
       int cd=0;
       qt.offer(root);
       q.offer(cd);
       while(!qt.isEmpty())
       {   
               Node temp=qt.poll();
               int c=q.poll();
               map.put(c,temp);
               if(temp.left!=null){
                   qt.offer(temp.left);
                   q.offer(c-1);
               }
               if(temp.right!=null){
                   qt.offer(temp.right);
                   q.offer(c+1);
               }
       }
       for(int idx:map.keySet())
       {
           ans.add(map.get(idx).data);
       }
       return ans;
    }
}