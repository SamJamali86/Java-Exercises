package com.mycompany.a.t.m;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long balance = 10000000;
        int choice;

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Current balance: " + balance + " Rial");
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    long deposit = input.nextLong();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful.");
                        System.out.println("New balance: " + balance + " Rial");
                    } else {
                        System.out.println("Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    long withdraw = input.nextLong();

                    if (withdraw <= 0) {
                        System.out.println("Invalid amount.");
                    } else if (withdraw % 50000 != 0) {
                        System.out.println("Amount must be a multiple of 50000.");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful.");
                        System.out.println("New balance: " + balance + " Rial");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our ATM.");
                    return;

                default:
                    System.out.println("Invalid option.");
    }
  }
}}