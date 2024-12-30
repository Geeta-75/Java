package String;

import java.util.Scanner;

public class String_Permute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[i] != a[k] && a[i] != a[j] && a[j] != a[k]) {
                        System.out.println(a[i] + "  " + a[j] + "   " + a[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total Element : " + count);
    }
}
