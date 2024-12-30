package Constructor;

import java.util.Scanner;

public class Calculate {

    public Calculate(int a, int b) {

        this.show(a, b);
    }

    void show(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose the symbol you to want : + , - , * ,/ , %  ->  ");
        String s = sc.nextLine();
        

        if (s.equals("+")) { 
            System.out.println(a + b);
        } else if (s.equals("-")) {
            System.out.println(a - b);
        } else if (s.equals("*")) {
            System.out.println(a * b);
        } else if (s.equals("/")) {
            System.out.println(a / b);
        } else if (s.equals("%")) {
            System.out.println(a % b);
        } else {
            System.out.println("Invalid Symbol");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int x = sc.nextInt();
        System.out.println("Enter the second number ");
        int y = sc.nextInt();

        Calculate obj = new Calculate(x, y);
    }
}
