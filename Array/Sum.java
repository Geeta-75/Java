package Array;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int a[] = new int [n];
         int sum = 0;
        System.out.println("Enter the Array Element ");
        for(int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println(" Sum of Array is :  " + sum);
    }
}
