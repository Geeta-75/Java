package myPack;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length ");
        int l = sc.nextInt();
        System.out.println("Enter the writh");
        int w = sc.nextInt();

        if(l % 2 == 0 && w % 2 == 0)
        {
            System.out.println("Square");
        }
        else{
            System.out.println("Rectangle");
        }
    }
    
}
