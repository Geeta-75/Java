package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Comparing_Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int n = sc.nextInt();
        int arr [] = new int[n];
        int arr2 [] = new int[n];
        System.out.println("Enter the First Array Elements :  ");
         for(int i = 0; i < n ; i++)
         {
            arr[i] = sc.nextInt();
         }
          System.out.println("Enter the Second Array Elements : ");
          for(int i = 0; i < n ; i++)
         {
            arr2[i] = sc.nextInt();
         }
         int [] cloned_Array_1 = arr.clone();
         int [] cloned_Array_2 = arr2.clone();

         if(Arrays.equals(cloned_Array_1, cloned_Array_2))
         {
            System.out.println("Arrays are equal. " );
         }
         else{
            System.out.println("Arrays are not Equal.");
         }
    }
}

// public class Comparing_Arrays {
//     public static void main(String[] args) {
//         int [] array1= {1,2,3};
//         int [] array2= {1,2,3};

//         int [] cloned_Array_1 = array1.clone();
//          int [] cloned_Array_2 = array2.clone();

//          if(Arrays.equals(cloned_Array_1, cloned_Array_2))
//          {
//             System.out.println("Arrays are equal.");
//          }
//          else{
//             System.out.println("Arrays are not equal");
//          }
//     }
    
// }
