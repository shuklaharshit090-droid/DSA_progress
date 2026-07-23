/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
       ArrayList<ListNode>ans=new ArrayList<>();
       ListNode temp=head;
       while(temp!=null)
       {
        ans.add(temp);
        temp=temp.next;
       } 
       ListNode dummy=new ListNode(-1);
       ListNode curr=dummy;
       for(int i=1;i<ans.size();i=i+2)
       {
           curr.next=ans.get(i);
           curr.next.next=ans.get(i-1);
           curr=ans.get(i-1);
       }
       if(ans.size()%2==1)
       {
        curr.next=ans.get(ans.size()-1);
        curr=ans.get(ans.size()-1);
       }
       curr.next=null;
       return dummy.next;
    }
}