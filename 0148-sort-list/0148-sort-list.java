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
 //same logic as merge sort
class Solution {
    public ListNode sortList(ListNode head) {
        //edge case
          if(head==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        //base case
        //recursion will work until there is one element is linklist
      
        if(slow.next==null || fast.next==null)return head;
        //slow fast approach to find middle
        while(fast.next!=null  && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //creating second linklist
        ListNode head2=slow.next;
        //creating end of second linklist
        slow.next=null;
        //important lines
       head= sortList(head);
       head2= sortList(head2);
return mergeTwoLists(head,head2);

        
    }
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
 //here we are using three pointer first on list 0ne second on list two and thrid on dummy ,dummy is a linklist which is merged and we have created it with -1 value and by comparing i anad j operations are performed respectively 
 //till either one of the linklist pointer gets to null
 //same like merge two sorted array
 //at the end 
 // two loops 
 //checking which point is not at null
 // and pointing dummy to that linklist
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //base case if any one linklist is null
        if(list1==null )return list2;
        if(list2==null)return list1;
        ListNode i=list1;
        ListNode j=list2;
        ListNode dummy =new ListNode(-1);
        ListNode k=dummy;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next=i;
                k=k.next;
                i=i.next;
            }
            else{
                k.next=j;
                k=k.next;
                j=j.next;
            }
        }
        if(i==null)k.next=j;
        if(j==null)k.next=i;
        //dummy head is -1 that why dummy.next or k.next to nai krenge kyuki k to null pe hoga
        return dummy.next;
        
    }
}
