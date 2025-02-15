package datastructures.linkedlist;

public class MyLinkedList {
    public void traverse(Node head) {
        Node current = head;
        while (null != current) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean search(Node head, int target){
        while (head != null){
            if (head.data == target){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public int length(Node head){
        int length = 0;
        Node current = head;
        while (current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    Node deleteLastNode(Node head){
        if(head == null){
            return null;
        }
        if (head.next == null){
            head = null;
            return null;
        }
        Node secondLastNode = head;
        while (secondLastNode.next.next != null){
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
        return head;
    }

}




