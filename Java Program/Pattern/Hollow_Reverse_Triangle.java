
package Pattern;
import java.util.Scanner;
public class Hollow_Reverse_Triangle {
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value");
int a = sc.nextInt();

for (int i = 1; i<= a; i++)
        {
            for ( int j = 1; j<=i; j++)
            {
                System.out.print("  ");
            }
            for (int k = a; k>=i ; k--)
            {
                if (k==a || i == 1 || k==i)
                System.out.print("*   ");
                else
                System.out.print("    ");
            }
            System.out.println();

        }}
}










