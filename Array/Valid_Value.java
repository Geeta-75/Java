package Array;

import java.util.Scanner;

public class Valid_Value {
    public static boolean contains(int[] arr, int num) {
        for (int i : arr) {
            if (num == i) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size :  ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("check it available number for the list ");
        int num = sc.nextInt();
        System.out.println(contains(a, num));
    }

}
