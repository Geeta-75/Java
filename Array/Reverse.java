package Array;

import java.util.Scanner;

public class Reverse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Array Size ");
    int n = sc.nextInt();
    int [] a= new int [n];
    System.out.println("Enter the Array Element");
    for(int i = 0 ; i < a.length ; i++)
    {
        a[i] = sc.nextInt();
    }
    System.out.println("Reverse Number");
    for(int  i = a.length - 1 ; i >= 0 ; i--)
        {
            System.out.println(a[i]);
   }

}   
}
