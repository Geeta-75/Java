package Recursion;

import java.util.Scanner;

public class Natural_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose it : 1 Natural, 2. natural reverse , 3. print both ");
        int ch = sc.nextInt();
        System.out.print("Enter the Value :  ");
        int n = sc.nextInt();
        if (ch == 1) {
            natural(n);
        } else if (ch == 2) {
            natural_reverse(n);
        } else if (ch == 3) {
            print_both(n);
        }

    }

    static void natural(int n) {
        if (n == 0) {
            return;
        }
        natural(n - 1);
        System.out.println(n);
    }

    static void natural_reverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        natural_reverse(n - 1);

    }

    static void print_both(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print_both(n - 1);
        System.out.println(n);
    }
}
