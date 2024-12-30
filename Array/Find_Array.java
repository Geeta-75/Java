package Array;

import java.util.Scanner;

public class Find_Array {
    public static void main(String[] args) {
        int i = 0, j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of element you want in array");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter the all Array Element");
        for (i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to array find");
        int ArrayFind = sc.nextInt();

        for (i = 0; i < num; i++) {
            if (a[i] == ArrayFind) {
                j = 1;
                break;
            } else {
                j = 0;
            }
        }
        if (j == 1) {
            System.out.println("Element found at position : " + (i + 1));
        } else {
            System.out.println("Element not found");
        }

    }

}
