package Recursion;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        EvenOdd(n);
        if (n % 2 == 0) {
            System.out.println("It's Even");
        } else {
            System.out.println("It's Odd");
        }
    }

    static int EvenOdd(int n) {
        if (n == 0) {
            return 1;
        }
        return n;
    }

}
