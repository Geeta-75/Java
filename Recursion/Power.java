package Recursion;

import java.util.Scanner;

public class Power {
    static int Power (int power,int num)
    {
         if(num ==0)
         {
           int Pnum = Power ( power, num);
           int p = Pnum*num;
         }
        return num;
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Power");
        int power = sc.nextInt();
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println("Ans : ");
        Power(num , power);
    }
    
}
