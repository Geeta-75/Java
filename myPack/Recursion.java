package myPack;

import java.util.Scanner;

public class Recursion {
    public static int Factorial(int n) {
        if (n > 0) {
            return n * Factorial(n - 1);
        } else {
            return 1;
        }
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // sum

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value ");
        int n = sc.nextInt();
        System.out.println("Choice is your : Recursion , 2. fact 3. sum");
        int ch = sc.nextInt();

        if (ch == 1) {

            int result = Factorial(n);
            System.out.println(n + " factorial = " + result);
        } else if (ch == 2) {
            int fact = fact(n);
            System.out.println(n + " of factorial : " + fact);
        } else if (ch == 3) {
            int sum = fact(n);
            System.out.println(" Sum : " + sum);
        }
    }

}
