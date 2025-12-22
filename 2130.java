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
    public int pairSum(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int max=0;

        //mid node
        while(fast!=null && fast.next!=null){ //for odd numbers we need fast.next!=null
            slow=slow.next;
            fast=fast.next.next;
        }

        //rev order
        ListNode nextNode=slow;
        ListNode prev=null;
        while(slow!=null){
            nextNode=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nextNode;
        }
        //sum
        while(prev!=null){
            int csum=head.val+prev.val;
            max=Math.max(max, csum);
            head=head.next;
            prev=prev.next;
        }
        return max;
    }
}
