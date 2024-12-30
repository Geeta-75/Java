package Program_Set;

import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  first Number : ");
        int a = sc.nextInt() ;
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
         System.out.print("Enter the Third Number : ");
         int c = sc.nextInt() ;

        sc.close();

        if(a > b && a > c )
        {
           System.out.println(" a is Greater Number  : " + a);
        }
        else if (b > a && b > c )
        {
            System.out.println(" b is Greater Number  : " + b);
        }
        else {
            System.out.println("c is Greater Number : " + c);
        }
    }
    
}
