public class HollowTriangleStarPattern {

    public static void main (String Args [] )
    {
         int a = 7;
        for (int i = 1; i <= a; i++)
        {
            for (int j = 6; j>= i; j--)
            {
                System.out.print("  ");
            }

            for ( int k = 1; k<=i ; k++)
            { 
                if ( k== 1 || i  == a || k==i )
                System.out.print("*  ");
                else
                System.out.print("   ");
            }

            System.out.println();
        }

    }
    }

     