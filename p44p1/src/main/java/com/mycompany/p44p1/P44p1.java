package com.mycompany.p44p1;

import java.util.Scanner;

public class P44p1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.println("Enter first string:");
        String a = input.nextLine();

        System.out.println("Enter second string:");
        String b = input.nextLine();

        String result = a + b;

        System.out.println("Result: " + result);
    }
}
