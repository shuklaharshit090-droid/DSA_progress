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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode>ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            ans.add(temp);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int i=0;i<ans.size();i++)
        {
            if(i!=ans.size()-n)
            {
                curr.next=ans.get(i);
                curr=ans.get(i);
            }
        }
        curr.next=null;
        return dummy.next;
    }
}