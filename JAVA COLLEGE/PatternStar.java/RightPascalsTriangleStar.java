public class RightPascalsTriangleStar {

    public static void main(String args[]) {
        int row = 5;
        int i, j;
        for (i = 1; i <= row; i++) {
            for (j = 1; j <= i; j++) {

                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {

                    System.out.print(" *");
                }

                else {
                    System.out.print("  ");
                }

            }
            System.out.println("  ");
        }

        for (i = row - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {

                if ((i % 2 != 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print(" *");
                }

                else {

                    System.out.print("  ");

                }

            }
            System.out.println("  ");
        }

    }
}