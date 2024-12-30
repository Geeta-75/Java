package Recursion;

import java.util.Scanner;

// public class Factorial {
// static int fact = 1 ;
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter any Number");
// int num = sc.nextInt();
// Factorial f = new Factorial();
// f.Factorial(num);
// System.out.println("Factorial Number " + num + " is " + fact);

// }
// int Factorial(int num)
// {
// if(num > 1)
// {
// fact = fact*num;
// Factorial(num - 1);
// }
// return num;
// }
// public void factorial(int n, int n2) {
// }
// }

// public class Factorial {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter any Number");
// int num = sc.nextInt();
// Factorial f = new Factorial();
// int fact = f.Factorial(num);
// System.out.println("Factorial Number " + num + " is " + fact);

// }
// int Factorial(int num)
// {
// if(num > 1)
// {
// return (num * Factorial(num - 1));
// }
// return 1;
// }
// }

public class Factorial
{
static int factorial (int n)
{
if(n==0)
return 1;
else
return (n*factorial(n-1));

}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter any Number");
int num = sc.nextInt();
int fact = 1;
fact = factorial(num);
System.out.println("Factorial of " + num + " is " + fact);
}
}