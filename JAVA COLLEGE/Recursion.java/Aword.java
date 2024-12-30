package Recursion ;
import java.util.Scanner;

public class Aword {
    static int a , i , j , n;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        sc.close();
        Println(1,n);
    }
    static void Println(int i , int n)
    {
        if (i <= n)
        {
            Space (a - 1 , i , n);
            Star(j + 1, i,n);
            System.out.println();
            Println(i + 1,n);
            
        }
    }
    static void Space (int a , int i , int n)
    {
        if (a > i)
        {
            System.out.print("  ");
            Space (a - 1, i , n);

        }
      
    }
    static void Star (int j , int i, int n)
    {
        if (j <= (2*i-1))
        {
            //if(i==5 && j<i+4 && j>i-4 || i == n)
            
            System.out.print(" *  ");
           Star(j+1,i,n);
        }
    }
 }
