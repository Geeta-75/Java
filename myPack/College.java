package myPack;

import java.util.Scanner;

public class College {

    static void form() {
        Scanner sc = new Scanner(System.in);
        System.out.println("choice is your : 1. ITEG 2. MEG 3. BEG");
        int ch = sc.nextInt();
        if (ch == 1) {
            ITEG i = new ITEG();
            Login();
        } else if (ch == 2) {
            MEG m = new MEG();
            Login();
        } else if (ch == 3) {
            BEG b = new BEG();
            Login();
        } else {
            System.out.println("Invalid Choice !");
        }
    }

    static void Login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String Name = sc.nextLine();
        System.out.print("Enter your email : ");
        String email = sc.nextLine();
        System.out.print("Enter your phone Number : ");
        String phone_no = sc.nextLine();
        System.out.print("Enter your Address : ");
        String Address = sc.nextLine();
        System.out.print("Enter your State : ");
        String State = sc.nextLine();
    }
}

class ITEG extends College {

}

class MEG extends College {

    print p = new print();

}

class BEG extends College {
    print p = new print();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Regestration Form : 1 yes , 2 No");
        int choice = sc.nextInt();
        if (choice == 1) {
            form();
        } else {
            System.out.println("Okay , No Problem ! Continue your Work ");
        }

    }

}

class print extends College {
    static void print(String string, String string2, String string3, String string4, String string5)

    {
        System.out.println("Name : " + string);
        System.out.println("Name : " + string2);
        System.out.println("Name : " + string3);
        System.out.println("Name : " + string4);
        System.out.println("Name : " + string5);
    }
}
