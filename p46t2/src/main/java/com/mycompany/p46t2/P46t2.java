package com.mycompany.p46t2;

import java.util.Scanner;

public class P46t2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter base:");
        int base = input.nextInt();

        System.out.println("Enter exponent:");
        int exponent = input.nextInt();

        System.out.println("Result: " + power(base, exponent));
    }

    public static int power(int base, int exponent) {

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }
}
