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
        ListNode smallerlist=new ListNode(0); //dummy node
        ListNode greaterlist=new ListNode(0);

        ListNode sptr=smallerlist; //pointer that stores values of dummy node l1
        ListNode lptr=greaterlist;

        while(head!=null){
            if(head.val<x){
                sptr.next=head;
                sptr=sptr.next;
            }
            else{
                lptr.next=head;
                lptr=lptr.next;
            }
            head=head.next;
        }
        lptr.next=null;
        sptr.next=greaterlist.next;
        return smallerlist.next;
    }
}
