class Solution {
    public static void dfs(ArrayList<Node>ans,Node root){
        if(root==null) return;
        ans.add(root);
        dfs(ans,root.left);
        dfs(ans,root.right);
    }
    public static void flatten(Node root) {
        if(root==null) return;
      ArrayList<Node>ans=new ArrayList<>();
      dfs(ans,root);
      for(int i=0;i<ans.size()-1;i++)
      {
          ans.get(i).right=ans.get(i+1);
          ans.get(i).left=null;
      }
      ans.get(ans.size()-1).right=null;
      ans.get(ans.size()-1).left=null;
    }
}