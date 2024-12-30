import java.util.Scanner;

public class SumScanner

{
    public static void main(String[] args)
    {
         int num  ;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        int square = num*num;
        System.out.println("Square  of  " + num + "  is  " + square);

    }
    
}
