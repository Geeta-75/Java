package Pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int a = s.nextInt();
        for(int i = 1; i <= a ; i++) {
            for (int j = a; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("  * ");
            }
            System.out.println();
        }
    }
}
