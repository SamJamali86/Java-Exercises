package com.mycompany.p44p2;

import java.util.Scanner;

public class P44p2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String a = input.nextLine();

        System.out.println("Enter a number:");
        int x = input.nextInt();

        String result = "";

        if (x <= a.length() && x >= 0) {
            result = a.substring(0, x);
        }

        System.out.println("Result: " + result);
    }
}
