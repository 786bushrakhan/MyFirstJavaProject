package datastructures.linkedlist;

public class MyLinkedListRunner {
    public static void main (String[] args){
        MyLinkedList obj = new MyLinkedList();
        int length = obj.length(null);
        System.out.println(length);
        obj.traverse(null);
        boolean search = obj.search(null, 1);
        System.out.println(search);
        Node head = obj.insertAtEnd(null, 12);
        obj.traverse(head);
        System.out.println(obj.length(head));
        head = obj.insertAtEnd(head, 5);
        obj.traverse(head);
        System.out.println(obj.length(head));
        head = obj.insertAtEnd(head, 15);
        head = obj.insertAtEnd(head, 17);
        head = obj.insertAtEnd(head, 27);
        obj.traverse(head);
        System.out.println(obj.length(head));
        obj.deleteLastNode(null);
        obj.deleteLastNode(head);
    }
}
