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
    public ListNode reverseList(ListNode head) {
        //edge case
        if(head==null)return head;
        Solution sc=new Solution();
        return sc.recursive(head);
//         //created temporary node 

//  ListNode temp=head;
//  //approach
//  //create an arraylist 
//  //add nodes to arraylist not value at node
//  //use reverse loop to
//  //change the value of next(to whom they are pointing)
//  //return last node as arraylist is remained same only pointing to changed
//  //make sure zeroth index next is null
//         ArrayList<ListNode> arr=new ArrayList<>();
       
//         while(temp!=null){
//             arr.add(temp);
//             temp=temp.next;
//         }
//         int n=arr.size();
//         for(int i=n-1;i>=1;i-- ){
//             arr.get(i).next=arr.get(i-1);
//         }
//         arr.get(0).next=null;
//         return arr.get(n-1);

        
//     }
// }
//good approach
//explantion in notes
// ListNode previous=null;
// ListNode current=head;
// ListNode forward=head;
// while(current!=null)
// {
//     forward=current.next;
//     current.next=previous;
//     previous=current;
//     current=forward;
// }
// return previous;
//     }
// }
    }
    //recursive approach explanation in notes
ListNode recursive(ListNode head){
    if(head.next==null)return head;
ListNode after=head.next;
head.next=null;
ListNode remaining=recursive(after);
after.next=head;
return remaining;

}
}
