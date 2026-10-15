package com.mycompany.seasons;

import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {
        System.out.println("plz enter number:");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x==1){
            System.out.println("Farvardin");
        }else if (x==2){
            System.out.println("Ordibehesht");
        }else if (x==3){
            System.out.println("Khordad");
        }else if (x==4){
            System.out.println("Tir");
        }else if (x==5){
            System.out.println("mordad");
        }else if (x==6){
            System.out.println("Shahrivar");
        }else if (x==7){
            System.out.println("Mehr");
        }else if (x==8){
            System.out.println("aban");
        }else if (x==9){
            System.out.println("azar");
        }else if (x==10){
            System.out.println("Day");
        }else if (x==11){
            System.out.println("Bahman");
        }else if (x==12){
            System.out.println("Esfand");
        }else{System.out.println("enter number most ptw (1-12)");}
    }
}
