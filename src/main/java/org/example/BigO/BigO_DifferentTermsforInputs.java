package org.example.BigO;

public class BigO_DifferentTermsforInputs {

    public static void printItems(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < b; i++) {
            System.out.println(i);
        }

    }

    public static void printSquareItems(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println(i + " " + j);
            }

        }


    }

    public static void main(String[] args) {
        printItems(10, 5);
        printSquareItems(10, 5);

    }

//printItems() T.C: this is not O(n) as we dont know a and b so the simplify of this is O(a+b)
//printItems() T.C: this is not O(n) as we dont know a and b so the simplify of this is O(a*b)
    //So here we need to understant Different Terms for the input
}