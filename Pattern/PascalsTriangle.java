package Pattern;

public class PascalsTriangle {

    public static void main(String args[]) {
        int i, j, n = 4;
        int k;
        for (i = 1; i <= n; i++) {
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (k == 1 || k == i || k == n + 1 || i == 1 || i == n + 1) {
                    System.out.print(1 + " ");
                }

                else

                {
                    System.out.print(i - 1 + " ");
                }
            }
            System.out.println();
        }

    }
}
