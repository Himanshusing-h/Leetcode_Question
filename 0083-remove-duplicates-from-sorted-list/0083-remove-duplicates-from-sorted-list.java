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
    public ListNode deleteDuplicates(ListNode head) {
        //base case
        if(head==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null){
            //comparing value at node not node
            //node comparisiton is done in cyclic question
            //used sliding window 
            //approach
            //slow ko zeroth index pe
            //fast ko ek index aage
            //agar
            //slow ki value or fast ki value same hui to fast ko aage krdo
            //agar
            //not equal to slow ka next fast kro
            //slow ko fast pe bhejo
            //fast ko next pe bhejo
            //at last fast null ho jaega
            //to bus slow ka next fast krdo 
            //or 
            //return head krdo
            
            if(slow.val==fast.val){
                fast=fast.next;
            }
            else{
                slow.next=fast;
                slow=fast;
                fast=fast.next;
            }
        }
        slow.next=fast;
             
                
    
       
        return head;
    }
}