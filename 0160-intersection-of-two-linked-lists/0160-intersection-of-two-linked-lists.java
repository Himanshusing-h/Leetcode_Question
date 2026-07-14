/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //every linklist meet at null
 //steps to follow
 //find length of each linklist
 //give fairadvantage to bigger linklist
 //until same length
 //now using loop check which node is equal not the val,and return the node if nothing will be equall null return
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode temp1=headA;
      int length1=0;
      int length2=0;
      int fairadv=0;
      ListNode temp2=headB;
      while(temp1!=null)  {
        temp1=temp1.next;
length1++;
      }
        while(temp2!=null)  {
        temp2=temp2.next;
length2++;
        }
temp1=headA;
temp2=headB;
      
      if(length1>=length2){
        fairadv=length1-length2;
        while(fairadv>0)
        {
            temp1=temp1.next;
            fairadv--;
      }
      }
      else{
fairadv=length2-length1;
while(fairadv>0){
    temp2=temp2.next;
    fairadv--;
}

      } 
      //if(temp1.val==temp2.val) return temp1;
      //List A: 1 → 2 → 3
//List B: 4 → 2 → 5
//Here the value 2 appears in both lists, but they are different nodes. There is no intersection.
//we have to see node equal or not ,not the val value can be same but nodes can be different
      while(temp1!=null ){
        if(temp1==temp2)return temp1;
        temp1=temp1.next;
        temp2=temp2.next;
      }
      return null;
    }
}