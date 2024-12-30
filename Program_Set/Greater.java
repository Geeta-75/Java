package Program_Set;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        sc.close();
        if (num > 1000)
        {
            System.out.println("Greter than " + num );
        }
        else if (num < 1000)
        {
            System.out.println("Smaller than " + num);
        }
    }
    
}
