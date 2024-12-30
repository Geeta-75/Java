package Array;

import java.util.Scanner;

public class Negative {
    public static void main(String[] args) {
        int Negative = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Array Element ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Negative Number");
        for (int i : a) {
            if (i < Negative) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println(" Total Numbers are " + count + " Negative");
        // for(int b = 0 ; b < a.length ; b++)
        // {
        // if (a[b]< Negative)
        // {
        // System.out.println(a[b]);
        // }
        // }
    }
}

// public class Negative {
// public static void main(String[] args) {
// int [] a = {1,-1,2,-2,4,-4,5,-6,7};
// for(int n : a)
// {
// if(n < 0)
// {
// System.out.println(n);
// }
// }
// }

// }
