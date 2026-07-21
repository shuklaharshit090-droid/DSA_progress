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
    public ListNode deleteDuplicates(ListNode head) {
       HashMap<Integer,Integer>map=new HashMap<>();
       ListNode temp=head;
       while(temp!=null)
       {
        if(map.containsKey(temp.val))
        {
            int freq=map.get(temp.val);
            map.put(temp.val,freq+1);
        }
        else{
            map.put(temp.val,1);
        }
        temp=temp.next;
       } 
       ListNode dummy=new ListNode(-101);
       ListNode curr=dummy;
       temp=head;
       while(temp!=null)
       {
        if(map.get(temp.val)==1)
        {
            curr.next=temp;
            curr=temp;
        }
        temp=temp.next;
       }
       curr.next=null;
      return dummy.next;
    }
}