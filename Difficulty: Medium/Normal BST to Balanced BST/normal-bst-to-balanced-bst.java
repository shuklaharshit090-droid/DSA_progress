/* BST Node Structure
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public static void inorder(Node root,ArrayList<Integer>arr)
    {
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
     public static Node tobst(ArrayList<Integer>arr,int low,int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        Node node=new Node(arr.get(mid));
        node.left=tobst(arr,low,mid-1);
        node.right=tobst(arr,mid+1,high);
        return node;
    }
    static Node balanceBST(Node root) {
        ArrayList<Integer>arr=new ArrayList<>();
        inorder(root,arr);
        return tobst(arr,0,arr.size()-1);
    }
}