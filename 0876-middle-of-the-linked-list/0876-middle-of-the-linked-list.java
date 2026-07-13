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
        //this is not a one pass solution
    //     ListNode temp=head;
    //     while(temp!=null){
    //         temp=temp.next;
    //         length++;
    //     }
    //       ListNode temp2=head;
    //       while(count!=length/2){
    //         temp2=temp2.next;
    //         count++;
    //       }
    //       return temp2;
       
    //     }
    // }
//slow and fast approach
ListNode slow=head;
ListNode fast=head;
//condition mai keval fast.next likhenge tbb error aaega
while(fast != null && fast.next != null)
{
    slow=slow.next;
    fast =fast.next.next;
}
return slow;
    }
}

        
    