package com.mycompany.donbaleadad;

import java.util.Scanner;

public class Donbaleadad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int steps = 0;
        int max = n;
        int evenCount = 0;
        int oddCount = 0;

        System.out.print("Sequence: ");

        while (true) {

            System.out.print(n + " ");

            if (n == 1) {
                break;
            }

            if (n % 2 == 0) {
                evenCount++;
                n = n / 2;
            } else {
                oddCount++;
                n = (3 * n) + 1;
            }

            steps++;

            if (n > max) {
                max = n;
            }
        }

        System.out.println();
        System.out.println("Number of steps: " + steps);
        System.out.println("Largest number: " + max);
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}
