package Pattern;

import java.util.Scanner;

public class Star1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element : ");
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++)
        {
            for(int j = n ; j>=i ; j--)
            {
                System.out.print(" * ");
                //System.out.print(i + " ");
                //System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
