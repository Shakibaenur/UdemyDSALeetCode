package org.example.DoublyLinkedList;

public class DoublyMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList(1);

        doublyLinkedList.printList();

        doublyLinkedList.append(10);
        doublyLinkedList.append(12);
        doublyLinkedList.printList();

        doublyLinkedList.removeLast();
        doublyLinkedList.printList();
    }
}
