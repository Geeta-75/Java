package Pattern;

import java.util.Scanner;

public class Pattern_Triange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value :  ");
        int n = sc.nextInt();
        for(int i = 1; i <= n ; i++)
        {
            for(int j = n ; j >= i ; j--)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k <=i ;k ++)
            {
                if(k== 1|| i == n || k == i )
                {
                    System.out.print("*  ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    
}
