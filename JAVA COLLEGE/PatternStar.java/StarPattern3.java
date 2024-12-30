public class StarPattern3 {

    public static void main(String args[])

    {
        for (int k = 1; k <= 2; k++)

            for (int i = 1; i <= 9; i++)

            {
                for (int j = 1; j <= 5; j++) {

                    if (i == 1 || i == 3 && (j == 5 || j == 4 || j == 2 || j == 1) || i == 5 && (j == 3)
                            || i == 7 && (j == 5 || j == 4 || j == 2 || j == 1) || i == 9)

                    {
                        System.out.print("*  ");
                    }

                    else {

                        System.out.print("   ");

                    }
                }

                System.out.println();
            }

    }
}
