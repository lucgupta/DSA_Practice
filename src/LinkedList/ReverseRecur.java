package LinkedList;

public class ReverseRecur {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    void push(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node rest = reverse(head.next);
        head.next.next = head.next;
        head.next = null;
        return rest;
    }

    public static void main(String[] args) {
        ReverseRecur llist = new ReverseRecur();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(85);
        llist.print();
        head = llist.reverse(head);
        llist.print();
    }


}
