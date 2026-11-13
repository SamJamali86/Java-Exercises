
package com.mycompany.ghotr.asli.faree;

import java.util.Scanner;

public class GhotrAsliFaree {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
           int[][] n = new int[3][3];
        int sumasli = 0;
        int sumfarei = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter number: ");
                n[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            sumasli = sumasli + n[i][i];
            sumfarei = sumfarei + n[i][2 - i];
        }

        System.out.println("ghotr asli = " + sumasli);
        System.out.println("ghotr faree = " + sumfarei);
    }
}
