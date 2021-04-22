package com.company;
import java.util.Scanner;

public class LoginOperation implements Login {
    static String userName;
    static int getPassword;
    Scanner scn = new Scanner(System.in);

    @Override
    public void getInput() {
        System.out.println("====================================");
        System.out.println("|      Welcome To ATM Services     |");
        System.out.println("------------------------------------");
        System.out.print("    User Name : ");
        userName = scn.nextLine();
        System.out.print("    Pass Word : ");
        getPassword = scn.nextInt();
    }

    @Override
    public void checkInput(String name, int password) {
        if(userName.equals(name) && (getPassword == password)){
            OptionDisplay.welcome();
            OptionDisplay.menu();
        }
        else {
            System.out.println("!!!- YOUR USER NAME OR PASSWORD IS INCORRECT -!!!");
        }
    }

}