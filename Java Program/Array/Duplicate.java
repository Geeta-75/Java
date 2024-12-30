package Array ;
  import java.util.Scanner;
  public class Duplicate 
{
   public static void main (String args[] )
{ 
   Scanner sc = new Scanner (System.in);
   System.out.print("Enter the Array Size :  " );
  int n = sc.nextInt();
  int a [] = new int [n];
  System .out.println("Enter the Array Elements " );
  for(int i = 0 ; i < n ; i ++)
{ 
    a [i] = sc.nextInt();
}

   System.out.println("Duplicate Value " );
   for(int i = 0 ; i < a.length - 1 ; i++)
 {
     if ( a[i] == a[i+1])
{ 
    System.out.println(a[i]);
}
}
}
}
