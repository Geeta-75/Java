public class RhombusPattern {

    public static void main(String args [] )
    {
        int lines = 5;
        int spaceCount = 3;
        int starCount = 4;
        for (int i = 1; i <= lines; i++) 
        {
            for ( int j = 5; j>= spaceCount; j--)
        
        {
            System.out.print(" ");
        }
        for ( int k = 1;k<=starCount; k++)
        {
            System.out.print(" * ");
        }
        System.out.println();
       spaceCount = spaceCount - 1;
    }
    
}
}