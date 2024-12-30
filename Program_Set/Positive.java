package Program_Set;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        sc.close();
        if(num > 0)
        {
            System.out.println("Positive Number :  " + num);
        }
        else if (num < 0)
        {
            System.out.println("Negative Number :  " + num);
        }
        else if(num == 0 )
        {
            System.out.println("Zero : " + num);
        }
        else{
            System.out.println("Invalid Number ....!");
        }
    }
    
}
