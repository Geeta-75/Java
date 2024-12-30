package Array;

import java.util.Scanner;

// public class Positive {
//     public static void main(String[] args) {
//         int [] a = {1,2,3,4,5,-2,-5};
//         for(int i : a)
//         {
//           if(i > 0)
//           {
//             System.out.println(i);
//           }
//         }
//     }

// }

public class Positive {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the all Elements ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Positive Number ");
        for (int i : a) {
            if (i > 0) {
                System.out.println(i);
               count++;
            }
        }
        System.out.println(" Total Numbers are " + count + " Positive ");
    }
}