package com.mycompany.p44p4;

import java.util.Scanner;

public class P44p4 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       System.out.println("Enter first string:");
        String a = input.nextLine();

        System.out.println("Enter second string:");
        String b = input.nextLine();

        System.out.println("Enter number:");
        int x = input.nextInt();

        if (x >= 0 && x <= a.length() && x <= b.length()) {

            String temp = a.substring(0, x);

            a = b.substring(0, x) + a.substring(x);
            b = temp + b.substring(x);

            System.out.println("New first string: " + a);
            System.out.println("New second string: " + b);

            System.out.println("true");

        } else {

            System.out.println("false");

    }
 }
}