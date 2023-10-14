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

        //(2) Items- Returns 2 Node
       System.out.println(linkedList.removeLastNode().value);
       //(1) Items- Returns 1 Node
        System.out.println(linkedList.removeLastNode().value);
        //(0) Items- Returns 0 Node
        System.out.println(linkedList.removeLastNode());
        //add an item to  first means prepend
        linkedList.prepend(89);

        linkedList.printList();
        System.out.println(linkedList.removeFirst());

        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        System.out.println("Get at position 2 : "+ linkedList.get(2).value);
        linkedList.printList();
        System.out.println("Set value at 3 : "+    linkedList.set(3,6));
        System.out.println("Set value at 2 : "+    linkedList.set(2,6));
        linkedList.printList();



    }
}
