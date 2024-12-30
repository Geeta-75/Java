import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any Number");
        // int n = sc.nextInt();
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i ; k++) {
                System.out.print(i + "   ");
            }
                System.out.println();
            }
        }
    }

