package Array ;
import java.util.Scanner;
public class  Large
 {
   public static void main (String [] args)
{
   Scanner sc = new Scanner (System.in );
  System.out.print("Enter the Array Size :  ");
  int n = sc.nextInt();
  int a [] = new int[n];
  System.out.println("Enter the Array all Elements ");
   for(int i = 0 ; i < a.length ; i++){
    a[i] = sc.nextInt();
}
 int max = 0;
 System.out.println("Largest Number " );
 for(int i = 0 ; i < a.length ; i++){
 if( max < a[i] ){
 max = a[i];
 }
}
 System.out.println(max );
 }
}
