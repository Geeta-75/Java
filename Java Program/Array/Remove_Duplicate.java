package Array ;
  import java.util.Scanner;
    public class Remove_Duplicate
{
   public static void main (String [] args )
{
   Scanner sc = new Scanner (System.in);
   System.out.print(" enter the array Size : " );
   int n = sc.nextInt();
    int [] a = new int [n];
    System.out.println("Enter the All Elements " );
    for(int i = 0 ; i < n ; i++){
    a[i] = sc.nextInt();
    }
    int d = 0;
    System.out.println(" Remove Duplicate Value " );
    for(int i = 0 ; i < a.length - 1; i++)
{
     if(a[i] == a[i+1])
{
    a[i] = d ;
}
}
for( int k = 0 ; k  < a.length ; k++)
{
    if ( a[k ] != d )
{
   System.out.println(a[k]);
}
}
}
}

     