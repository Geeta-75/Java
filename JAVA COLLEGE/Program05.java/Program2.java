public class Program2 {

    public static void main(String [] args )
    {
        int i , j ,k ;
        int n = 4;

        for (i = 1; i <= n ; i ++)
        {
            for ( j = 1; j <= i ; j ++)

{
    System.out.print("  ");
}      
for ( k = i ; k <= n ; k ++) 

{
    System.out.print(k + "  ");
}

System.out.println();
}

for ( i = n - 1 ; i >= 1 ; i --)

{
    for ( j = 2; j <= i ; j ++)
    {
        System.out.print("  ");
    }
    for (k = 1 ; k <= n ; k++)
    {
        System.out.print(k + "  " );
    }
    System.out.println();
}
    }
    
}
