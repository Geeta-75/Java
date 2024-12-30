package myPack;

import java.util.Scanner;

public class Permute_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String s = sc.nextLine();
        int count = 0;
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[i] != a[k] && a[i] != a[j] && a[j] != a[k]) {
                        System.out.println(a[i] + "  " + a[j] + "  " + a[k]);
                        count++;
                    }
                }
            }
            System.out.println("----------------------------------------------");
        }
        System.out.println("Total Element : " + count);
    }

}
