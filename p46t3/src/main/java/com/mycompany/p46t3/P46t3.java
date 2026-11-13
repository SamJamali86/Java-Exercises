package com.mycompany.p46t3;

import java.util.Scanner;

public class P46t3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = input.nextInt();

        fibonacci(n, 1, 1);
    }

    public static void fibonacci(int n, int a, int b) {

        if (n <= 0) {
            return;
        }

        System.out.print(a + " ");

        fibonacci(n - 1, b, a + b);
    }
}
