package myPack;

public class G_Shape {
    public static void main(String[] args) {
        // int n = 5;
         int rows = 6, cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 2 && (j == 2) || i == 2 && (j == 3) || i == 2 && (j == 4) || i == 2 && (j == 5)
                        || i == 3 && (j == 2)
                        || i == 4 && (j == 2) || i == 4 && (j == 4)
                        || i == 5 && (j == 2) || i == 5 && (j == 4)
                        || i == 6 && (j == 4)) {
                    System.out.print(" *  ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

}
