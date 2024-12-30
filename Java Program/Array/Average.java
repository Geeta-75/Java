package Array ;
import java.util.Scanner;
public class Average 
{
   public static void main (String args [])
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Array Size : " ) ;
    int n = sc.nextInt();
     int a [] = new int [n];
    int sum = 0 ;
     System.out.println("Enter the All Elements " );
     for(int i = 0 ; i < n ; i++)
{
    a[i] = sc.nextInt();
}
 for(int i = 0 ; i < n ; i++)
{
    sum += a[i];
}
     
   double Average = sum / n ;
   System.out.println("Average : " + Average );
 
}
}
   