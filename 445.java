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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        while(l1 != null){
            s1.push(l1.val); //val - reason line 4
            l1=l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2=l2.next;
        }
        //for storing the res we are creating a LinkedList
        ListNode dummy=new ListNode(0); 
        //we have to store sum and carry
        int carry=0; // stores extra value when sum>9
        int sum=0;
        //while loop for the addition of elements
        while(!s1.isEmpty() || !s2.isEmpty() || carry != 0){
            sum=carry;
            if(!s1.isEmpty()){ //when s1 is empty
                sum += s1.pop();
            }
            if(!s2.isEmpty()){  //when s2 is empty
                sum += s2.pop();
            }
            dummy.next = new ListNode(sum%10, dummy.next);
            carry=sum/10;
        }
        return dummy.next;
    }
}
