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
        if(head==null){
            return head;
        }
        ListNode pre=head;
        ListNode temp=head.next;
        while(temp!=null){
            if(temp.val==pre.val){
                temp=temp.next;
            }else{
                pre.next=temp;
                pre=temp;
                temp=temp.next;
            }
        }
        pre.next=temp;
        return head;
    }
}



// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode current = head;
//         while( current !=null && current.next != null){
//             if(current.val == current.next.val){
//                 current.next=current.next.next; // skipping duplicate node
//             }else{
//                 //move to next node
//                 current=current.next;
//             }
//         }
//         return head;
        
//     }
// }
