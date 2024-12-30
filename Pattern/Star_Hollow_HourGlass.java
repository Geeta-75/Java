package Pattern;

import java.util.Scanner;

public class Star_Hollow_HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Odd Number :  ");
        int n = sc.nextInt();  // only 5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i + j == n + 1 || i == j || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

}
