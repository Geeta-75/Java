package Array;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array Size : ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the all elements ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        System.out.println("Maximum Number ");
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
       
    }

}
