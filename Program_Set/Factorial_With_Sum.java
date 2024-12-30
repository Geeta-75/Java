package Program_Set;

import java.util.Scanner;

public class Factorial_With_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Element");
        int num = sc.nextInt();
        int fact = num;
        for(int i = fact - 1 ; i > 0 ; i--)
        {
            int sum = 0;
            for(int j = 1 ; j <= i  ; j++)
            {
                sum = sum + fact;
            }
            fact = sum;
        }
        System.out.println("Factorial " + num + " is " + fact);
    }
    
}
