public class HollowReverseTringlePattern {

    public static void main (String args [] )
    {

        int a = 19 ;
        for (int i = 1; i<= a; i++)
        {
            for ( int j = 1; j<=i; j++)
            {
                System.out.print("  ");
            }
            for (int k = a; k>=i ; k--)
            {
                if (k==a || i == 1 || k==i)
                System.out.print("*   ");
                else
                System.out.print("    ");
            }
            System.out.println();

        }
    }
    
}
