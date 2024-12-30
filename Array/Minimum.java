package Array;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
       // int a [] = {4,6,7,5,2,4,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the Array Element ");
        for(int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int Minimum = a[0];
        //System.out.println("Minimum Number");
        for(int i = 0 ; i < a.length ; i++)
        {
            if(Minimum > a[i])
            {
                 Minimum = a[i];
            }
        }
        System.out.println("Minimum Number is : " + Minimum);
    }
    
}
