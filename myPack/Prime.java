package myPack;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value ");
        int n = sc.nextInt();
        int Sum = sum(n);
        System.out.println("Sum of numbers from 1 to " + n + " is: " + Sum);
    }

    static int sum (int n )
    {
        if(n==0)
        {
            return 0;
        }
        return n + sum (n-1);
    }


        static void show (){
        int n = 7;
        int temp = 0;
        for(int i = 2; i <=n-1 ; i++){
            if(n % i == 0)
        
        {
            temp = temp + 1;
        }
    }
        if(temp == 0)
        {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("not a prime number");
        }
    }
}

