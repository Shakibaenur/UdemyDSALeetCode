package org.example.Linkedlist;

public class LinkedListConstrutor {
    private Node head;
    private Node tail;
    private int length;

     class Node {
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
    }

    public LinkedListConstrutor(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void printList(){
         Node tempNode=head;
         while(tempNode!=null){
             System.out.println(tempNode.value);
             tempNode = tempNode.next;
         }
    }
    public void getHead(){
         System.out.println("Head: "+head.value);
    }
    public void getTail(){
         System.out.println("Tail: "+ tail.value);
    }
    public void getLength(){
         System.out.println("Length: "+length);
    }
    public void append(int value){
         Node newNode=new Node(value);
         if(length==0){
             //if linked list id empty
             head=newNode;
             tail=newNode;
         }else{
             //if linked list is not empty
             tail.next=newNode;// ask tail.next node point to newNode
             tail=newNode;//assign tail as new Node
         }
         length++;// increase the length
    }
}
