
public class PalindromeTriangular {

    public static void main(String [] args )
    {
        int i ,j , k ,l , n = 4;

for (i = 1; i<=n ; i++)
 {
    for (j = n - 1; j>= i; j--)
    {
        System.out.print("   ");
    }
    for ( k = i; k>= 1 ; k--) 
    {
        System.out.print("  " +  k);
    }
    for (l=2; l<=i ; l++) 
    {
        System.out.print( "  " + l);
    }
    System.out.println("   ");
}

    }
    
}
