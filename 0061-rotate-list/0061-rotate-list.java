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
 //approach linklist ko todda or jooda that it
class Solution {
    public int len(ListNode head){
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        return length;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        ListNode slow =head;
        ListNode fast=head;
        int length=len(head);
        k=k%length;
        if(k==0)return head;

     
    for(int i=1;i<=k+1;i++){
        fast=fast.next;
    }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;

        }
        ListNode a=slow.next;
        slow.next=null;
     ListNode tail=a;
        while(tail.next!=null){
            tail=tail.next;
        }
      tail.next=head;
      return a;
        

   
        
    }
}