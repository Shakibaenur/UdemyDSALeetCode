package org.example.BigO;

public class BigO_logn {

    public static int  printItems(int n) {
       return n+n;

    }

    public static void main(String[] args) {
        printItems(10);

    }

//T.C: O(1) no matter what the n value is it will only do 1 operation that is n+n
    //O(1) also called constant operation as this is can be more than 1 operation
}