package com.mycompany.p46t1;

import java.util.Scanner;

public class P46t1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = input.nextInt();

        printDescending(n);
    }

    public static void printDescending(int n) {

        if (n < 1) {
            return;
        }

        System.out.println(n);

        printDescending(n - 1);
    }
}
