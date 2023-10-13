package org.example.Linkedlist;

import javax.sound.sampled.Line;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListConstrutor linkedList=new LinkedListConstrutor(4);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.append(2);
        linkedList.printList();

    }
}
