package com.mycompany.p44p5;

import java.util.Scanner;

public class P44p5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius:");
        int r = input.nextInt();

        System.out.println("Circle area: " + area(r));

        System.out.println("Enter rectangle length:");
        int a = input.nextInt();

        System.out.println("Enter rectangle width:");
        int b = input.nextInt();

        System.out.println("Rectangle area: " + area(a, b));

        System.out.println("Enter triangle base:");
        double base = input.nextDouble();

        System.out.println("Enter triangle height:");
        double height = input.nextDouble();

        System.out.println("Triangle area: " + area(base, height));
    }

    public static double area(int r) {
        return Math.PI * r * r;
    }

    public static int area(int a, int b) {
        return a * b;
    }

    public static double area(double base, double height) {
        return (base * height) / 2;
    }
}
