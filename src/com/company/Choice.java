package com.company;
import java.util.Scanner;

public class Choice {
    static Scanner scn = new Scanner(System.in);
    public static int x;
    public static int previousAmount =0;
    public static int balance=0;

    public static void getChoice(){
        System.out.println("-----------------------------------------------");
        System.out.print("Enter your Choice : ");
        x = scn.nextInt();
        System.out.println("-----------------------------------------------");
    }

    public static int previousTransaction(){
        if(previousAmount>0){
            System.out.println(" DEPOSIT : "+ previousAmount);
        }
        else if(previousAmount<0){
            System.out.println("WITHDRAWAL : "+ previousAmount);
        }
        else {
            System.out.println("---No Previous Transaction !!! ---");
        }
        return previousAmount;
    }

    public static int deposit(){
        System.out.print(" DEPOSIT : ");
        previousAmount =scn.nextInt();
        balance = balance + previousAmount;
        System.out.println(" Balance is = " + balance);
       return previousAmount;
    }

    public static int withdrawal(){
        System.out.print(" WITHDRAWAL : ");
        previousAmount =scn.nextInt();
        balance = balance - previousAmount;
        System.out.println(" Balance is = " + balance);
        return (-previousAmount);
    }
}
