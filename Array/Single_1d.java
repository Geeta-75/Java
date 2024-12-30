package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Single_1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int a[] = new int [n];
        System.out.println("Enter the Array Element ");
        for(int i = 0 ; i<n ; i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Sorted Array Elements ");
        for(int b : a)
        {
            System.out.println(b);
        }
    }
    
}
