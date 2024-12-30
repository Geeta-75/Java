package myPack;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shiva's age  ");
        int a = sc.nextInt();
        System.out.println("Enter the Gauri's age ");
        int b = sc.nextInt();
        System.out.println("Enter the Riya's  age");
        int c = sc.nextInt();

        if(a >1 && a<=18 || b >1 && b<=18 || c >1 && c <=18 )
        {
            System.out.println("Child Peron age is : " + a);
        }
        else {
            System.out.println("No Available");
        }
        if (a > 18 && a <= 50 || b > 18 && b <= 50 || c > 18 && c <= 50)
        {
            System.out.println("Youngest Person age is :  " + b);
        }
          else {
            System.out.println("No Available");
        }
        if (a > 50 && a <= 100 || b > 50 && b <= 100 || c > 50 && c <= 100 ){
            System.out.println("Oldest Person age is :  " + c);
        }
        else {
            System.out.println("Invalid");
        }
    }
    
}
