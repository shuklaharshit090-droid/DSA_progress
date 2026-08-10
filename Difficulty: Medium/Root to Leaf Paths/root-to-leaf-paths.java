/* Definition for Node
class Node
{
    int data;
    Node left;
    Node right;
    Node(int val)
    {
        this.data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public void dfs(ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>a,Node root)
    {
        if(root==null) return;
        a.add(root.data);
        if(root.left==null && root.right==null)
        {
            ArrayList<Integer>list=new ArrayList<>();
            list.addAll(a);
            ans.add(list);
        }
        dfs(ans,a,root.left);
        dfs(ans,a,root.right);
        a.remove(a.size()-1);
    }
    public ArrayList<ArrayList<Integer>> paths(Node root) {
       ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
       if(root==null) return ans;
       dfs(ans,new ArrayList<>(),root);
       return ans;
    }
}