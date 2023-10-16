package org.example.Linkedlist;

public class LinkedListConstrutor {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedListConstrutor(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.println(tempNode.value);
            tempNode = tempNode.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            //if linked list id empty
            head = newNode;
            tail = newNode;
        } else {
            //if linked list is not empty
            tail.next = newNode;// ask tail.next node point to newNode
            tail = newNode;//assign tail as new Node
        }
        length++;// increase the length
    }

    public Node removeLastNode() {
        if (length == 0) return null;//base condition
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        return temp;

    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp=head;
        head=head.next;
        temp=null;
        length--;
        if(length==0)
            tail=null;
        return temp;
    }

    public Node get(int index){
        if(index<0 || index>=length)
            return null;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index, int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }

    public boolean insert(int index,int value){
        if(index<0 || index>=length) return false;
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newNode= new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }

    public  Node remove(int index){
        if(index<0 || index>=length)
            return null;
        if(index==0)
           return removeFirst();
        if(index==length-1)
            return removeLastNode();
        Node prev=get(index-1);
        Node temp=prev.next;

        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    public Node findTheMiddleNode(){
        if (head == null) {
            return null; // Empty list, no middle node
        }

        Node slowPointer = head;
        Node fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        return slowPointer;
    }
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }
}
