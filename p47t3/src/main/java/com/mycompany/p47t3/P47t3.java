package com.mycompany.p47t3;

import java.util.Scanner;

public class P47t3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = input.nextInt();
        input.nextLine();

        String[] students = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            students[i] = input.nextLine();
        }

        printReversedNames(students);
    }

    public static void printReversedNames(String[] students) {

        for (int i = 0; i < students.length; i++) {

            String reversed = "";

            for (int j = students[i].length() - 1; j >= 0; j--) {
                reversed = reversed + students[i].charAt(j);
            }

            System.out.println(reversed);
    }
  }
}