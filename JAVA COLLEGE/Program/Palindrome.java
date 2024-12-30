import java.util.Scanner ;
public class Palindrome
 {
     public static void main ( String [] args )
 {
     Scanner sc = new Scanner ( System.in );
     System.out.println(" Enter the Array Size " );
     int n  = sc.nextInt();
     int temp = n , rev = 0 , rem ;
    while( temp != 0 )
   {
      rem = temp % 10;
     rev = rev * 10 + rem ;
     temp = temp / 10;
    }
    if(n == rev )
{
 System.out.println("It's Palindrome");
}
else
{
System.out.println("It's not Palindrome");
}

  }
}


 

     