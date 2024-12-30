package Pattern;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value :  ");
        int n = sc.nextInt();
        for(int i = 1 ; i<= n ; i++)
        {
            // for(int j = n- 1; j>=i ; j--)
            // {
            //     System.out.println(" ");
            // }
            for(int k = 1; k <= n ; k++)
            {
                if(k==1 || k == i || k == n + 1|| i ==1 || i == n + 1)
                {
                    System.out.print(" " + 1);
                }
                else{
                    System.out.print(" " + (i+1) );
                }
            }
            System.out.println();
        }
    }
    
}
