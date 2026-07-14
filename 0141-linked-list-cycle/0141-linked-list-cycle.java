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
 //we will use slow fast approach
 //think like a clock
 //second hand crosses hour hand
 //so
 //if fast equal slow return true
public class Solution {
    public boolean hasCycle(ListNode head) {
      
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
           
            slow=slow.next;
            fast=fast.next.next;
             if(fast==slow)return true;
        }
        return false;
        
    }
}