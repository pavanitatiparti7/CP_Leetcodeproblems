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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return null;
        }
        ListNode temp=head;
        int n=0;

        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%(n+1);
        int jump=n-k;
        ListNode p=head;

        while(jump>0){
            p=p.next;
            jump--;
        }

        ListNode res=p.next;
        p.next=null;
        return res;
        
    }
}
