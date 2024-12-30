package Program ;
import java.util.Scanner;
public class Fabonacci {
public static int fabonacci(int n )
{
    if(n==0)
{
    return 0;
} 
return (fabonacci (n-1 ) + fabonacci ( n - 2 ));
}

public static void main (String args [] ){
Scanner sc = new Scanner (System.in);
System.out.print("Enter the Number : " );
int n= sc.nextInt();
for(int i = 0 ; i < n ;  i++){
System.out.println(fabonacci(n));

}
}
}
 