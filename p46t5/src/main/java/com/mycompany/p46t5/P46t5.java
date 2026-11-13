package com.mycompany.p46t5;

import java.util.Scanner;

public class P46t5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of disks:");
        int n = input.nextInt();

        towerOfHanoi(n, 'A', 'C', 'B');
    }

    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, auxiliary, destination);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        towerOfHanoi(n - 1, auxiliary, destination, source);
    }
}
