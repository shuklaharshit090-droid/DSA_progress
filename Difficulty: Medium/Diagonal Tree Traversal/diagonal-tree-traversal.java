/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}*/
class Solution {
    public void dfs(HashMap<Integer,ArrayList<Integer>>map,Node root,int levels)
    {
        if(root==null) return;
        if(!map.containsKey(levels))
        {
            map.put(levels,new ArrayList<>());
        }
            map.get(levels).add(root.data);
        // ans.get(levels).add(root.data);
        dfs(map,root.left,levels+1);
        dfs(map,root.right,levels);
    }
    public ArrayList<Integer> diagonal(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root==null) return ans;
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        // map.put(0,new ArrayList<>());
        // map.get(0).add(root.data);
        dfs(map,root,0);
        ArrayList<Integer>ans1=new ArrayList<>();
        for(int i:map.keySet())
        {
            ans1.addAll(map.get(i));
        }
        return ans1;
    }
}