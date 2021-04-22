package com.company;
import java.util.Scanner;
import static com.company.LoginOperation.userName;

public class OptionDisplay  {
    static Scanner scn = new Scanner(System.in);
    public static int x;
    public int previousTransaction = 0;

    public static void welcome() {
        System.out.println("Hi " + userName + " welcome your bank account ....");
    }

    public static void menu() {
        System.out.println("-----------------------------------------------");
        System.out.println("|           OPERATION MENU                    |");
        System.out.println("-----------------------------------------------");
        System.out.println("|             1. Previous Transaction         |");
        System.out.println("|             2. Deposits                     |");
        System.out.println("|             3. Withdrawal                   |");
        System.out.println("|             4. Exit                         |");
        //System.out.println("-----------------------------------------------");
    }

}