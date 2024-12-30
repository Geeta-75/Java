package Program_Set;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        int count = 0;
       Scanner sc = new Scanner (System.in);
       System.out.println("Enter the Number");
       int n = sc.nextInt();
       System.out.println("Factor of Number (L.C.M )");
        for (int i = 1 ; i <=n ; i++)
        {
           if(n % i == 0)
           {
            System.out.println(i);
            count++;
           }
        }
        System.out.println("Total Element are " + count);

    }
    
}
