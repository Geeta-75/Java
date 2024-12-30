 public class HollowSquareStar {
   
    public static void main (String [] args)
    {
        int rows = 6;
        int col = 6;

        for (int i = 1; i <= rows ; i ++) {
            for ( int j = 1; j <= col; j++)

            if ( (i == 1  || i == col ) || ( j == 1 || j == col))

            System.out.print(" * ") ;

            else

            System.out.print("   ");

            System.out.println();
        }
    }
    
}
