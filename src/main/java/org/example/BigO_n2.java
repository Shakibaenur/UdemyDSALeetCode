package org.example;

public class BigO_n2 {

    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+" "+j);
            }
        }
    }

    public static void main(String[] args) {
        printItems(10);
    }

//T.C: O(n^2)
}