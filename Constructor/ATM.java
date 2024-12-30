package Constructor;
// ATM Machine with Coding :

/*import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {
        int Pin = 7557;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Pin");
        int pin = sc.nextInt();
        if (Pin == pin)
        {
           Login();
        }
        else 
        {
            System.out.println("Incorrect Pin");
        }
    }
    public static void Login() {
        int balance = 20000;

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcom to ATM");
         int pin = sc.nextInt();
        
        if (pin == 1)
        {
            System.out.println(" Check Balance : " + balance);
                System.out.println("");
            }
    }
}*/

// import java.util.Scanner;

// public class ATM
// {
//      static int pin = 5577;
//     public static void main(String[] args) {

//       int balance = 50000;

//         ATM.Login(pin);
//         ATM.menu(  balance , 0 ,0);
//     }

//         static void Login (int pin)
//         {
//         Scanner sc = new Scanner (System.in);

//         //System.out.println("Enter your name ");
//         //String name = sc.nextLine();

//          //System.out.println("Enter the bank name");
//          //String Bank = sc.nextLine();
//         //System.out.println("Enter the Debit Card ");
//         //String Card = sc.nextLine();

//         System.out.println("Enter the pin " );
//          int pin1 = sc.nextInt();

//         while (pin1 != pin)
//       {
//         System.out.println("Incorrect pin try again ");
//         System.out.println("Enter your Pin");
//         pin1 = sc.nextInt();

//         }

//         if (pin1 == pin)
//         {
//           System.out.println("Your pin is correct  " + pin);
//         }
//         //else 
//         //{
//         //    System.out.println("Your pin is Incorrect");
//        // }
//         }
//     static void menu(int balance , int withdraw , int deposit)
//         {
//             while (true)
//         {
//              int Withdraw ;

//             Scanner sc = new Scanner (System.in);

//             System.out.println(" choose 1 for Withdraw");
//             System.out.println("--------------------------");
//             System.out.println(" choose 2 for deposite");
//             System.out.println("-------------------------");
//             System.out.println("choose 3 for Check Balance");
//             System.out.println("---------------------------");
//             System.out.println(" choose 4 for Exit");
//             System.out.println("----------------------------");
//             System.out.println("choose correct operation to perform :");

//             int ATM = sc.nextInt();
//             switch (ATM)
//             {
//                 case 1:
//                 System.out.println("Enter the  Withdraw  Amount ");

//                 Withdraw = sc.nextInt();

//                 if (balance >= Withdraw)
//                 {
//                     balance = balance - Withdraw;
//                     System.out.println("your are update is " + balance);
//                 }
//                 else
//                 {
//                     System.out.println("Insufficient funds....!");
//                 }

//                 break;

//                 case 2 :

//                 System.out.println(" Enter the Deposit Amount :");

//                 deposit = sc.nextInt();

//                 balance = balance + deposit;
//                 System.out.println("Successfully Deposit  : " + balance);

//                 break; 

//                 case 3 :

//                 System.out.println(" Total Amount  : " + balance);
//                 System.out.println("----------");
//                 break;

//                 case 4 :
//                 System.out.println( 0);

//             }

//         }
//         }
//     }

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        int balance = 10000, withdrawing, depositamount;

        ATM.ATM(balance);
        ATM.withdrawing(balance, 0);
        ATM.depositing(balance, 0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Generate Pin");
        int Generate = sc.nextInt();
        System.out.println("Enter the pin");
        int pin = sc.nextInt();

        if (Generate != pin)
            System.out.println("Incorrect pin try again ");
        System.out.println("Enter your Pin");
        pin = sc.nextInt();

        if (Generate == pin) {
            System.out.println("Correct Pin ");
        }
    }

    // System.out.println("Welcome :");
    // System.out.println("-----------");

    // int withdrawAmount = 5000;
    // int depositamount = 2000;

    // ATM (balance);

    // balance = withdrawing (balance , withdrawAmount);
    // balance = depositing (balance , depositamount);

    // }
    // }

    public static void ATM(int balance) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Check Balance");
        balance = sc.nextInt();
        System.out.println("Balance : " + balance);

    }

    public static void withdrawing(int balance, int withdrawAmount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Withdraw Operation ");
        withdrawAmount = sc.nextInt();
        System.out.println("Withdrawing Amount : " + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Amount : " + balance);
        } else {
            System.out.println("Sorry !");
            System.out.println();
        }

    }

    public static int depositing(int balance, int depositamount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("depositing Amount : " + depositamount);
        System.out.println();
        balance = balance + depositamount;
        System.out.println();
        return depositamount;

    }

}

