package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                if (i == 1 && i == 3 && i == 5 && i == n || (j == 1) || i == 2 && i == 4 && i == 6 || (j == 2)
                        || i == 3 && i == 5 || (j == 3) || i == 4 || (j == 4)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
