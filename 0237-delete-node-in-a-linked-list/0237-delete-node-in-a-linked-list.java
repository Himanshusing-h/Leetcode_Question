/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode target) {
         //humne kya kiya
         //target ki valve change krdi uske next value se
         //or
         //target point kr dega target ki next ki next value ko
        target.val=target.next.val;
        target.next=target.next.next;
    }
}