package myPack;

import java.util.Scanner;

public class Practise {
  public static void main(String[] args) {
    // Java program to print 'Hello' on screen and your name on a separate line
    System.out.println("Hello");
    System.out.println("------------------------");
    // Java program to print the sum of two numbers.
    int sum = 74 + 36;
    System.out.println(sum);
    System.out.println("------------------------");
    // Java program to print the divide of two numbers.
    int divide = 50 / 3;
    System.out.println(divide);
    System.out.println("------------------------");

    int a = -5 + 8 * 6;
    int b = (55 + 9) % 9;
    int c = 20 + -3 * 5 / 8;
    int d = 5 + 15 / 3 * 2 - 8 % 3;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println("------------------------------------");

    System.out.println("    J        a    v       v     a");
    System.out.println("    J       a a    v     v     a a");
    System.out.println("J   J      aaaaa    V   V     aaaaa");
    System.out.println("  JJ       a   a      V       a   a");

    System.out.println("------------------------------------");

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number : ");
    int n= sc.nextInt();
    int count = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
          for (int k = 1; k <= n; k++) {
              if (i != k && i != j && j != k) {
                  System.out.println(i + " " + j + " " + k);
                  count++;
              }
          }
      }
      System.out.println("---------------------------------");
  }
  System.out.println("Total Element : " + count);
}

}

