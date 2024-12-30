package Array;

import java.util.Scanner;

public class Reverse_Reference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int a[] = new int [n];
        int b [] = new int[a.length];
        System.out.println("Enter the Array Element ");
        for(int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0 ; i < a.length ; i++)
        {
            b[(a.length - 1) - i] = a[i];
        }
        System.out.println("Reverse Number");
        for( int i = 0 ; i< b.length ; i++)
        {
            System.out.println(b[i]);
        }
    }
        }  


// public class Reverse_Reference{
//     public static void main(String[] args) {
//         int a [] = {1,2,3,4,5};
//         int b [] = new int [a.length];
//         for(int i = 0 ; i < a.length ; i++)
//         {
//             b [(a.length - 1) - i ] = a[i];
//         }
//        System.out.println("Reverse Number");
//         for(int i = 0 ; i < b.length ; i++)
//         {
//                 System.out.println(b[i]);
//             } 
        
//     }
// }

