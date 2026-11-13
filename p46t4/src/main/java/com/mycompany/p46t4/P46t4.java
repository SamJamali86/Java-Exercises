package com.mycompany.p46t4;

import java.util.Scanner;

public class P46t4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = input.nextInt();

        System.out.println("Binary: " + toBinary(n));
    }

    public static String toBinary(int n) {

        if (n < 2) {
            return String.valueOf(n);
        }

        return toBinary(n / 2) + (n % 2);
    }
}
