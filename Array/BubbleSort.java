package Array;

import java.util.Scanner;

public class BubbleSort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of element you want in array");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter the all Array Element");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] > a[j + 1]) {
                    int temp = a[i];
                    a[i] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        printArray(a);
    }

}
