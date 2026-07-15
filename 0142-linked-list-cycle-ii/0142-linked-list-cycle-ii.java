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
 //Approach
 //using slow fast approach find where cyclic or not
 //if not cyclic return null
 //if cyclic use begin method to find first node of cycle(always work)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        //to find cyclic or not
        ListNode slow=head;
        ListNode fast=head;
        //to find first index
        ListNode begin=head;
        while(fast!=null && fast.next!=null)
        {
            //two things will happen either slow fast equal or fast will become null
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }

        }
        //if fast becomes null return null as non cyclic linklist
        if(fast==null ||fast.next==null)return null;
        //if cyclic this approach will help to find first node
        while(slow!=begin){
            slow=slow.next;
            begin=begin.next;
        }
        //returning node
    
        return begin;
        
    }
}