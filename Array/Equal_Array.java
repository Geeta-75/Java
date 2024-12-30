package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size :");
        int n = sc.nextInt();
        int a []  = new int[n];
        int a2 [] = new int[n];
        System.out.println("Enter the First Elements : ");
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Second Elements :  ");
        for(int i = 0 ;i < n ; i++)
        {
           a2[i] = sc.nextInt();
        }
       int[] A = a.clone();
       int[] B = a2.clone();
        if(Arrays.equals(A , B))
        {
              System.out.println("Arrays are Equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
    
 

// public class Equal_Array{
//     public static void main(String[] args) {
        
//         //int count = 0 ;
//         int a [] [] = { {3,4,5} , { 4,6,7} , {2,8,9} };
//         int b [] [] = { {3,4,5} , { 4,6,7} , {2,8,9} };
   
//         for ( int i = 0 ; i < a.length ; i ++)
//            {
//                for (int j = 0 ; j < a[i].length ; j ++ )
//                {
//                   if (a [i] [j] == b [i] [j])
   
//                   {
//                    System.out.println("Array's are equal ");
//                   }
               
//                else
//                {
//                System.out.println("Array's are not equal ");
//                } 
//            }
//                System.out.println(" ");      
//    }
       
//    }
//        }
   

