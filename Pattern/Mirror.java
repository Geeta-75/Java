package Pattern;

public class Mirror {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == j || j + i == n + 1 || i == n) {
                    System.out.print("  " + j);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
