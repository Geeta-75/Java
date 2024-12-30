package Encapsulation;

import java.util.Scanner;

class Bank {
    private int balance = 50000;
    private static int password;

    static void password() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Generet Paasword");
        password = sc.nextInt();
        System.out.println("Enter the Password");
        int pwd = sc.nextInt();

        if (password == pwd) {

        }
    }

    public void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Deposit Amount ");
        int d = sc.nextInt();

    }
}

public class Person {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.password();
        int ch;
        System.out.println(" 1. Deposit ");
        System.out.println("2. Withdraw ");
        System.out.println(" 3. Checkbalance");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice : ");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                b.password();
                break;

            default:
                break;
        }
    }

}
