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
    public ListNode swapNodes(ListNode head, int k) {
        //temp1 is for going kth index from the start
        ListNode temp1=head;
        //slow and fast is for finding kth index from the end
        ListNode slow=head;
       ListNode fast=head;
       //index starting from 1
       int advantage=1;
       //giving fair advantage
       
       while(advantage<k){
        fast=fast.next;
        advantage++;
       }
       //reseting value of advantage
       advantage=1;
       //if dont fast!=null then fast will go to null and slow will be at last value 
       //therefore fast.next!=null so fast reach at last index and slow at second last index
while(fast.next!=null){
    fast=fast.next;
    slow=slow.next;
}
//going to kth index from the start
while(advantage<k){
    temp1=temp1.next;
    advantage++;
    }
    //swapping
    int temp=slow.val;
    slow.val=temp1.val;
    temp1.val=temp;
    //returning head
    return head;
}
}
