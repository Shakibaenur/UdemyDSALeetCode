package org.example.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value=value;
        }
    }
    public DoublyLinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public void append(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
        }
        tail=newNode;
        length++;
    }

    public Node removeLast(){
        if(length==0){
            return  null;
        }
        if(length==1){
            head=null;
            tail=null;
        }
        Node temp=tail;
        tail=tail.prev;
        tail.next=null;
        temp.prev=null;
        length--;
        return temp;
    }

    public void printList(){
        Node temp= head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: "+head);
    }

    public void getTail(){
        System.out.println("Tail: "+ tail);
    }

    public void getLength(){
        System.out.println("Length: "+length);
    }

}
