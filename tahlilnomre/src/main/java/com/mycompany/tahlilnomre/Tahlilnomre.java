package com.mycompany.tahlilnomre;

import java.util.Scanner;

public class Tahlilnomre {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int students;

        do {
            System.out.print("Enter number of students: ");
            students = input.nextInt();
        } while (students <= 0);

        double sum = 0;
        double max = 0;
        double min = 20;

        int passed = 0;
        int excellent = 0;

        for (int i = 1; i <= students; i++) {

            double grade;

            do {
                System.out.print("Enter grade of student " + i + ": ");
                grade = input.nextDouble();
            } while (grade < 0 || grade > 20);

            sum += grade;

            if (grade > max) {
                max = grade;
            }

            if (grade < min) {
                min = grade;
            }

            if (grade >= 10) {
                passed++;
            }

            if (grade >= 18) {
                excellent++;
            }
        }

        double average = sum / students;

        int belowAverage = 0;

        System.out.println("\nEnter grades again to count below average:");

        for (int i = 1; i <= students; i++) {

            double grade;

            do {
                System.out.print("Enter grade of student " + i + ": ");
                grade = input.nextDouble();
            } while (grade < 0 || grade > 20);

            if (grade < average) {
                belowAverage++;
            }
        }

        double passPercentage = (passed * 100.0) / students;

        System.out.println("\n===== RESULTS =====");
        System.out.println("Average: " + average);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);
        System.out.println("Passed students: " + passed);
        System.out.println("Excellent grades: " + excellent);
        System.out.println("Below average: " + belowAverage);
        System.out.printf("Pass percentage: %.2f%%\n", passPercentage);
    }
}
