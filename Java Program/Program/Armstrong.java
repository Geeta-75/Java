package Program;
   import java.util.Scanner;
   public class Armstrong
{
   public static void main ( String [] args )
{
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the Number : " );
    int num = sc.nextInt();
    int temp = num , rev = 0 , rem ;
   
   while(temp != 0)
{
    rem = temp % 10;
    rev =  rev + rem * rem * rem ;
    temp = temp / 10 ;
}

if ( num == rev ) 
{
   System.out.println ( " It's Armstrong  : " + num );
}
else {
           System.out.println("It's not Armstrong " );
}
}
}