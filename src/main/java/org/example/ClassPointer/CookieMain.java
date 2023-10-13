package org.example.ClassPointer;

public class CookieMain {
    public static void main(String[] args) {
        Cookie cookieOne=new Cookie("Green");
        Cookie cookieTwo=new Cookie("Blue");

        cookieOne.setColor("Red");
        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());

    }
}
