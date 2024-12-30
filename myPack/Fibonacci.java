package myPack;

import java.util.Scanner;

public class Fibonacci {

    static int fabonacci(int n) {
        int a = 0, b = 1, c;
        if (n <= 1) {
            return n;
        }
        return fabonacci(n - 1) + fabonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        System.out.println("Fabonacci Series up to index  " + n + " : ");
        for (int i = 0; i <= n; i++) {
            System.out.println(fabonacci(i) + "  ");
        }
    }

}
