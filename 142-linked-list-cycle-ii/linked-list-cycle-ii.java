/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    ListNode temp=head;
    HashSet<ListNode>set=new HashSet<>();
    int count1=0;
    while(temp!=null)
    {
      if(set.contains(temp)==false)
    {
        set.add(temp);
        count1++;
    }
    else{
        break;
    }
    temp=temp.next;
    }
    ListNode slow=head;
    ListNode fast=head;
       while(fast!=null && fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast)
           {
               break;
           }
       }
       if(fast==null || fast.next==null) return null;
       slow=slow.next;
       int count=1;
       while(slow!=fast)
       {
           slow=slow.next;
           count++;
       }
       int a= count;
       int f=Math.abs(a-count1);
       temp=head;
       for(int i=0;i<f;i++)
       {
        temp=temp.next;
       }
       return temp;
    }
}