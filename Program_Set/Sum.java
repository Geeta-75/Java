package Program_Set;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element");
        int a = sc.nextInt();
        System.out.println("Enter the second element");
        int b = sc.nextInt();
        sc.close();

        int sum = a + b;
        System.out.println("Sum of Two Integer value : " + sum );
    }
    
}
