package Program_Set;

import java.util.Scanner;

public class SwapProgram {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first Number");
         int a = sc.nextInt();
         System.out.println("Enter the Second Number");
         int b = sc.nextInt();
          
         a = a + b;
         b = a - b;
         a = a - b;

         System.out.println("Swap Number a is : "  + a);
         System.out.println("Swap Number b is : " + b);
    }
    
}
