package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Remove_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a : 1. Index_Remove , 2. Arraytype_IndexRemove");
        int ch= sc.nextInt();
        if(ch == 1){
        System.out.println("Enter the Index Number");
        int n = sc.nextInt();
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < a.length; i++) {
            if (i == n) {
                System.out.println("Deleted Element : " + a[i]);
                a[i] = 0;
                break;
            }
        }
        if (n >= 0 && n < a.length) {
            System.out.println(" New Array's Element");
            for (int j = 0; j < a.length; j++) {
                if (j != n) {
                    System.out.println(a[j]);
                }
            }
        }
    }

    if(ch == 2){
        System.out.print("Enter the Array Size :  ");
        int n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Enter the all elements");
        System.out.println("Enter the Index ");
        int r = sc.nextInt();
        for(int i = r ; i < n - 1 ; i++)
        {
           if(a[i] == a[i+1]){

           }
           System.out.println("After removing the element: " + Arrays.toString(a));
        }
    }
    }
}
