package myPack;

import java.util.Scanner;

public class Duplicate_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        int count;
        char[] a = name.toCharArray();
        for (int i = 0; i < a.length; i++) {
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && a[j] != ' ') {
                    count++;
                    a[j] = '0';
                }
            }
            if (count > 1 && a[i] != '0')
                System.out.println(a[i]);
        }
    }

}
