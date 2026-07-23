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
    public ListNode partition(ListNode head, int x) {
        //edge case if null linklist is given
        if(head==null)return head;
        //we are creating two dummy linklist with value -1;
        //and
        //d1 and d2 pointing at there head
        ListNode dummy1=new ListNode(-1);

        ListNode dummy2=new ListNode(-1);
        ListNode d1=dummy1;
        ListNode d2=dummy2;
        //temp is pointing at head of original linklist
        ListNode temp=head;
        //this loop will sort list less than x
        while(temp!=null){
            if(temp.val<x){
                d1.next=temp;
                //important step
                //d or temp dono ko aage badhao
                d1=d1.next;
                temp=temp.next;
            }
            else{
                d2.next=temp;
                //d and temp dono ko aage badho
                d2=d2.next;
                temp=temp.next;
            }
        }
        //forcefully d1 or d2 dono ke next ko null krdo kyuki kisi ek ka next null nai hua hoga 
        d1.next=null;
        d2.next=null;
        //d1 or d2 end mai hi hoga to humme dubara traver krne ki need nai hai
        //or d1.mext se dummy2 ko link kiya d2 ko naiii kyuki d2 to dummy 2 ke end mai hai
        d1.next=dummy2.next;
       //dummy1.next return kiya kyuki dummy ke head pe -1 hai
          
return dummy1.next;
    
    }
}