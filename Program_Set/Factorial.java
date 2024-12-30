package Program_Set;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int num = sc.nextInt();
        int fact = 1;
        sc.close();

        for(int i = 1; i <=num ; i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial Number  "+ num + " of " + fact );
    }
    
}
