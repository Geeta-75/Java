package Recursion;

import java.util.Scanner;

public class GCD_Calculate {
    static int Gretest_Common_diviser(int n, int n2) {
        if (n2 == 0) {
            return n;
        }
        int remainder = n % n2;
        return Gretest_Common_diviser(n2,remainder);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value ");
        int n = sc.nextInt();
        System.out.println("Enter the Value ");
        int n2 = sc.nextInt();
        int gcd = Gretest_Common_diviser(n, n2);
        System.out.println("The GCD of " + n + " and " + n2 + " is: " + gcd);
    }

}
