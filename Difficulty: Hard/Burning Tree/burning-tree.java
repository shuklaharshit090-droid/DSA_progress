/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public int minTime(Node root, int target) {
      HashMap<Node,Node>map1=new HashMap<>();
      Queue<Node>qt=new LinkedList<>();
      Node tar=null;
      qt.offer(root);
      map1.put(root,null);
      while(!qt.isEmpty())
      {
          Node temp=qt.poll();
          if(temp.data==target)
          {
              tar=temp;
          }
          if(temp.left!=null)
          {
              map1.put(temp.left,temp);
              qt.offer(temp.left);
          }
          if(temp.right!=null)
          {
              map1.put(temp.right,temp);
              qt.offer(temp.right);
          }
      }
      Map<Node,Boolean>map2=new HashMap<>();
      qt.offer(tar);
      map2.put(tar,true);
      int ans=-1;
      while(!qt.isEmpty())
      {
          int size=qt.size();
          for(int i=0;i<size;i++)
          {
              Node temp=qt.poll();
              map2.put(temp,true);
              if(temp.left!=null && !map2.containsKey(temp.left))
              {
                  qt.offer(temp.left);
              }
              if(temp.right!=null && !map2.containsKey(temp.right))
              {
                  qt.offer(temp.right);
              }
              if(map1.get(temp)!=null && !map2.containsKey(map1.get(temp)))
              {
                  qt.offer(map1.get(temp));
              }
          }
          ans++;
      }
      return ans;
    }
}