package Pattern;

import java.util.Scanner;

public class Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choice is your : 1. Star Pattern 2. Number Pattern");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.print("Enter the Number of Lines : ");
            int n = sc.nextInt();
            int spaceCount = n - 2;
            int starCount = n - 1;
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= spaceCount; j--)

                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= starCount; k++) {
                    System.out.print("  *  ");
                }
                System.out.println();
                spaceCount = spaceCount - 1;
            }

        } else if (ch == 2) {
            System.out.print(" Enter the Number ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= n; k++) {
                    System.out.print(k + "   ");
                }
                System.out.println();
            }
        }
    }
}
