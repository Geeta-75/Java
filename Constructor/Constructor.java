package Constructor;

// public class Constructor {

//     public Constructor()
//     {
//         System.out.println("Riya");
//     }
//     public static void main(String[] args) {
//         Constructor obj = new Constructor();
//         Constructor R = new Constructor();
//         Constructor I = new Constructor();
//         Constructor Y = new Constructor();
//         Constructor A = new Constructor();

//     }

// }

// 5 Name Program 

import java.util.Scanner;

public class Constructor {

    public Constructor(String a) {

        System.out.println("RADHESHYAM");
    }

    public Constructor(int b) {
        System.out.println("GAURISHANKAR");

    }

    public Constructor(char c) {
        System.out.println("Rani");
    }

    public Constructor(int d, String e) {
        System.out.println("Sneh");
    }

    public Constructor(int f, char g) {
        System.out.println("Ram");
    }

    // 01Constructor(ref)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the name");
        // String A = sc.nextLine();
        // System.out.println("Enter the SECOND NAME ");
        // String B = sc.nextLine();

        System.out.println("Enter String value ");
        String a = sc.nextLine();
        // Constructor obj= new Constructor(a);

        System.out.println("Enter any integare value");
        int b = sc.nextInt();
        // Constructor obj1 = new Constructor(b);

        System.out.println("Enter character value ");
        char c = sc.next().charAt(0);
        // Constructor obj2 = new Constructor(c);

        System.out.println("Enter any integer and string value ");
        int d = sc.nextInt();
        String e = sc.nextLine();
        // Constructor obj3 = new Constructor(d,e);

        System.out.println("Enter integer and char value");
        int f = sc.nextInt();
        char g = sc.next().charAt(0);
        Constructor obj4 = new Constructor(f, g);

        // System.out.println(" choose 1 ");
        // System.out.println("--------------------------");
        // System.out.println(" choose 2 ");
        // System.out.println("-------------------------");
        // System.out.println("choose 3 ");
        // System.out.println("---------------------------");
        // System.out.println(" choose 4 ");
        // System.out.println("----------------------------");
        // System.out.println(" choose 5 ");
        // System.out.println("----------------------------");
        // System.out.println("Enter the value :");
        // int C = sc.nextInt();
        // switch (C)
        // {
        // case 1:
        // System.out.println("Enter the First Name ");
        // int n = sc.nextInt();
        // Constructor obj = new Constructor(1);
        // break;

        // case 2:
        // System.out.println("Enter the Second Name ");
        // String b = sc.nextLine();
        // Constructor s = new Constructor('a');
        // break;

        // case 3:
        // System.out.println("Enter the Third Name ");
        // String c= sc.nextLine();
        // Constructor r = new Constructor("Raj");
        // break;

        // case 4:
        // System.out.println("Enter the Fourth Name ");
        // String d = sc.nextLine();
        // Constructor i = new Constructor(7,"Ram");
        // break;

        // case 5:
        // System.out.println("Enter the Fifth Name ");
        // String e = sc.nextLine();
        // Constructor j = new Constructor(5,'d');
        // break;
        // }

    }
}
