package com.mycompany.tashkhisadad;

import java.util.Scanner;

public class Tashkhisadad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int count = 0;
        int sum = 0;
        int properSum = 0;

        System.out.println("Divisors:");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                count++;
                sum += i;

                if (i < n) {
                    properSum += i;
                }

                if (i > 1 && i < n) {
                    System.out.println(i);
                }
            }
        }

        System.out.println("Number of divisors: " + count);
        System.out.println("Sum of divisors: " + sum);

        if (count == 2) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }

        if (properSum == n) {
            System.out.println("The number is perfect.");
        } else {
            System.out.println("The number is not perfect.");
    }
  }
}
