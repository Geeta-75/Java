package Recursion;

import java.util.Scanner;

// Write a Java recursive method to calculate the sum of all numbers from 1 to n.

public class Sum_Caluculator {
    static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + Sum(n - 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value ");
        int n = sc.nextInt();
        int sum = Sum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + sum);
    }

}
