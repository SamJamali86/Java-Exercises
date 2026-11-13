package com.mycompany.p44p3;

import java.util.Scanner;

public class P44p3 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String a = input.nextLine();

        System.out.println("Enter x:");
        int x = input.nextInt();

        System.out.println("Enter y:");
        int y = input.nextInt();

        String result = "";

        if (x >= 0 && y >= 0 && x <= a.length() && y <= a.length() && x <= y) {
            result = a.substring(x, y);
        }

        System.out.println("Result: " + result);
    }
}
