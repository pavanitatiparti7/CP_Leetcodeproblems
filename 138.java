/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node curr=head;
        while(curr!=null){
            Node newNode=new Node(curr.val); //creating new node between two existing node
            newNode.next=curr.next; //giving connections
            newNode.random=curr.random;
            curr.next=newNode;
            curr=curr.next.next;
        }
        curr=head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random=curr.random.next;
            }
            curr=curr.next.next;
        }
        Node newHead=head.next;
        Node temp=head;
        Node newTemp=newHead;
        while(temp != null){
            temp.next=temp.next.next;
            if(newTemp.next != null){
                newTemp.next=newTemp.next.next;
            }
            temp=temp.next;
            newTemp=newTemp.next;
        }
        return newHead;
    }
}
