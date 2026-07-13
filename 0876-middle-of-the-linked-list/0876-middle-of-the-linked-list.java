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
    public ListNode middleNode(ListNode head) {
         int length=0;
        int count=0;
        //to create temp node dont usse
        //Node temp =new Node(head.val);
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
          ListNode temp2=head;
          while(count!=length/2){
            temp2=temp2.next;
            count++;
          }
          return temp2;
       
        }
    }

        
    