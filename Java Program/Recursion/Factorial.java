package Recursion;
import java.util.Scanner;
 public class Factorial {
  public static int Fact (int n ) 
{
   if(n == 0 )
     return 1 ;
    else
   return  ( n * Fact(n-1));
}

public static void main (String args [])
{  
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the Number " );
   int n = sc.nextInt();
  int fact = 1;
  fact = Fact(n);
   System.out.println("Factorial " + n + " of  " + fact + " " );
}
} 