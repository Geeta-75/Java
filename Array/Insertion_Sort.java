package Array;

import java.util.Scanner;

public class Insertion_Sort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && current < a[j]) {
                a[j + 1] = a[j];
                j--;

            }
            a[j + 1] = current;
        }
        printArray(a);

    }

}
