package Program_Set;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Element : ");
        int num = sc.nextInt();
        int a = 0 , b = 1 , c;
        sc.close();

        for(int i = 1; i <= num ; i ++)
        {
            c = a + b ; 
            System.out.println(a);
            a = b;
            b = c;
        }
        
    }
    
}
