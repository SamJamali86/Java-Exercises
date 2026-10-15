package tahlil.adad;

import java.util.Scanner;


public class TahlilAdad {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("plz enter number:");
        if(x<=0){
            System.out.println("Error Plz enter mosbat number");}
        if (x>=0){
           int originalNumber =x;
            int count=0;
            int jam=0;
            int zarb=1;
            int max=0;
            int min=9;
            int zojcount=0;
            int fardcount=0;
            int revers=0;
            while (x>0){
            int y = x % 10;
            count++;
            jam +=y;
            if(y!=0){
            zarb *=y;}
            if (y>max){
            max=y;
            }
            if (y<min){
            min=y;
            }
            if (y%2==0){
            zojcount++;
            } else {fardcount++;}
            revers = revers *10+y; x =x/10;}
            System.out.println("NUMBER =  "+originalNumber);
            System.out.println("COUNT =  "+count);
            System.out.println("JAM =  "+jam);
            System.out.println("ZARB =  "+zarb);
            System.out.println("MAX =  "+max);
            System.out.println("MIN = "+min);
            System.out.println("ADADFARD =  "+fardcount);
            System.out.println("ADADZOJ = "+zojcount);
            System.out.println("REVERS=  "+revers);
        }input.close();
            }
        }
        

