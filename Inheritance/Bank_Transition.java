package Inheritance;

import java.util.Scanner;

public class Bank_Transition {
    static int id ;
    String date = "01/12/2023";
    int amount = 50000;

    static void Transition() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your id");
       int ID = sc.nextInt();
       id = ID ;
    }
}

class Deposit extends Bank_Transition {
    void Deposit() {
        super.Transition();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Deposit Amount :");
        int deposit = sc.nextInt();
        if (amount >= deposit)
        // if(Withdraw <= amount)
        {
            amount = amount + deposit;
            System.out.println("Successfully Deposit  : " + amount);
            System.out.println("--------------------------");
            System.out.println("Transection id : " + id);
            System.out.println("Date : " + date);
            System.out.println("Total Amount : " + amount);
        } else {
            System.out.println("Insuffisient Funds ..!!");
        }
    }
}

class Withdraw extends Bank_Transition {
    void Withdraw() {
        super.Transition();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  Withdraw  Amount ");
        int Withdraw = sc.nextInt();
        if (amount >= Withdraw)
        // if(Withdraw <= amount)
        {
            amount = amount - Withdraw;
            System.out.println("your are update is " + amount);
            System.out.println("--------------------------");
            System.out.println("Transection id : " + id);
            System.out.println("Date : " + date);
        } else {
            System.out.println("Insufficient funds....!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("                Welcome               ");
        System.out.println("--------------------------------------");
        System.out.println("What do you want (Deposit or Withdraw)");
        System.out.println("-------------------------------------");
        String A = sc.nextLine();
        if (A.equals("Deposit")) {
            Deposit obj = new Deposit();
            obj.Deposit();
        } else if (A.equals("Withdraw")) {
            Withdraw obj1 = new Withdraw();
            obj1.Withdraw();
        } else {
            System.out.println("Invalid");
        }

    }
}
