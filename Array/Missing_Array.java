package Array;

import java.util.Scanner;

public class Missing_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the all Elements ");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
      int expected_num_Element = n + 1;
      int total_sum = expected_num_Element *(expected_num_Element+1 )/2;

      int sum = 0;
      for(int i = 0 ; i <n ; i++)
      {
        sum = sum + a[i];
      }
      System.out.println("Missing Elements are : " + ( total_sum - sum ) );
    }
    
}

// public class Missing_Array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Array Size ");
//         int n = sc.nextInt();
//         int [] a = new int[n];
//          int xor = a[0];
//         System.out.println("Enter the all Elements");
//         for(int i = 0 ; i < n ; i++)
//         {
//             a[i] = sc.nextInt();
//             xor = xor^a[i];
//         }
//         int xor2 = 1;
//         for(int i = 2 ; i <= n+1 ; i++)
//         {
//             xor2 = xor2^i;
//         }
//         System.out.println("Missing Element is " + (xor^xor2));
//     }
// }