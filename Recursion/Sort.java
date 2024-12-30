package Recursion;

//import java.util.Arrays;
//import java.util.Scanner;

public class Sort {
    static void bubbleSort (int arr [] , int n)
    {
        if (n == 1)
        {
            return ;
        }

        for(int i = 0 ; i < n - 1 ; i++)
        {

           if(arr[i] > arr [i + 1])
           {
              int temp = arr [i];
              arr [i] = arr[i+1];
              arr [i+1] = temp ;
           }
           bubbleSort(arr, n-1);
        }
        
    }
    public static void main(String[] args) {
        int arr [] = {8,7,6,5,4,3,2,1};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Size of Array ");
        // int n = sc.nextInt();
        // int arr []  = new int[n];
        // System.out.println("Enter any Element");
        // for(int i = 0 ; i<n; i ++)
        // {
        //     arr [i] = sc.nextInt();
        // }
         bubbleSort(arr,arr.length);
         System.out.println("Sorted Array Elements ");
         for(int i = 1 ; i<arr.length + 1; i++)
         {
             System.out.println(i);
         
         //for(int i  : arr ){
         
        //System.out.println(Arrays.toString(arr));
       
         }
    }
    
}



