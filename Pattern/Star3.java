package Pattern;

import java.util.Scanner;

public class Star3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Value :  ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <=n ; j++)
            {
                System.out.print(""); 
                //System.out.print(j + " ");
            }
                for(int k = n ; k >= i; k--)
                {
                    System.out.print(" * ");
                    //System.out.print(i + " ");
                }
                System.out.println();
            }
        }
}

