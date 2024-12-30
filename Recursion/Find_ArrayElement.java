package Recursion;

import java.util.Scanner;

public class Find_ArrayElement {
    public static boolean ArrayElement (int i , int Target)
    {
        if(i == 0){
        return false;
        }
        else {
        return (ArrayElement(i + 1, Target));
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter the Array Elements ");
        for(int i = 0; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Find Element ");
        int Find = sc.nextInt();
        int Target = Find ;

        ArrayElement(Find, Target);
        System.out.println(Target);
    }
    
}
