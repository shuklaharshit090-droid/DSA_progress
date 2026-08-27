/* A Tree node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        left = right = null;
        data = x;
    }
}*/

class Solution {
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
      ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
      ArrayList<Integer>arr=new ArrayList<>();
      dfs(root,ans,arr,sum);
      return ans;
    }
    public void dfs(Node root,ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>arr,int sum)
    {
        if(root==null) return;
        arr.add(root.data);
        if(root.data==sum)
        {
            // arr.add(root.data);
            ArrayList a=new ArrayList<>();
            a.addAll(arr);
            ans.add(a);
            // arr.remove(arr.size()-1);
            // return;
        }
        // arr.add(root.data);
        dfs(root.left,ans,arr,sum-root.data);
        dfs(root.right,ans,arr,sum-root.data);
        arr.remove(arr.size()-1);
        
    }
}