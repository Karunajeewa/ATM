package com.company;

import java.util.Scanner;
import static com.company.Choice.x;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Login newLog = new LoginOperation();
        newLog.getInput();
        newLog.checkInput("Nimal",1234);
        Choice.getChoice();
        do {
            if(x==1){
                Choice.previousTransaction();
            }
            else if(x==2){
                Choice.deposit();
            }
            else if(x==3){
                Choice.withdrawal();
            }
            else {
                System.out.println("Your choice is Invalid !!!");
            }
            Choice.getChoice();
        }while (x!=4);
    }
}
