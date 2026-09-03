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
 //approach
 //take three node
 //forward prev and curr
 //use rough paper to do then frame solution
class Solution {
    public ListNode reverseList(ListNode head) {
if(head==null){
    return null;

}
ListNode prev=null;
ListNode curr=head;
ListNode fr=head;
//important lines
while(fr.next!=null){
    fr=curr.next;
    curr.next=prev;
    prev=curr;
    curr=fr;
}
//this also
curr.next=prev;
return curr;

        
    }
}