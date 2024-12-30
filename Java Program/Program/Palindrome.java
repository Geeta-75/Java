package Program ;
    import java.util.Scanner;
    public class Palindrome 
{
    public static void main ( String args [] )
{
    Scanner sc = new Scanner (System.in);
    System.out.print(" Enter the Number : " );
    int n = sc.nextInt();
    int temp = n ; 
    int rev = 0 , rem;
    
    while(temp != 0 )
{
    rem = temp % 10 ;
    rev = rev * 10  + rem ;
     temp = temp / 10;
}
 
if ( rev == n )
{
    System.out.println("It's Palindrome :  "  +  n);
}
else {
            System.out.println(" It's not Palindrome " );
}
}
}
    