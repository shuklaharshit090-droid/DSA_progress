/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    void dfs(Node root,int x,ArrayList<Integer>a)
{
        if(root==null) return;
        dfs(root.left,x,a);
        if(root.data>=x) a.add(root.data);
        dfs(root.right,x,a);
    }
    int findCeil(Node root, int x) {
        ArrayList<Integer>a=new ArrayList<>();
        // a[0]=-1;
        dfs(root,x,a);
        return (a.size()==0)?-1:a.get(0);
    }
}