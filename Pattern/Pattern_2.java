package Pattern;

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value :  ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
              if(i % 2 == 0)
              {
                System.out.print("  " + 2);
              }
              else{
                System.out.print("  " + 1);
              }
            }
            System.out.println();
        }
    }
    
}
