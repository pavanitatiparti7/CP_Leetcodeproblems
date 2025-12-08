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
        Stack<Integer> s=new Stack<>();
        while(head != null){
            s.push(head.val);
            head=head.next;
        }
        ListNode dummy=new ListNode(99);
        ListNode res=dummy;
        while(!s.isEmpty()){
            ListNode ptr=new ListNode(s.pop());
            dummy.next=ptr;
            dummy=dummy.next;
        }
        return res.next;
    }
 }
//OR
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;

//         while (curr != null) {
//             ListNode next = curr.next;  // store next node
//             curr.next = prev;           // reverse link
//             prev = curr;                // move prev forward
//             curr = next;                // move curr forward
//         }

//         return prev; // new head
//     }
// }
