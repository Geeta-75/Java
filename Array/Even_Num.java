package Array;

import java.util.Scanner;

public class Even_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Enter the Array Element");
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Even Number");
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] % 2 == 0)
            {
                System.out.println(a[i] );}
            
        }
        // System.out.println(count);
    }
    
}
