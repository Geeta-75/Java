package Program_Set;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rectangle Length ");
        int Length = sc.nextInt();
        System.out.println("Enter the Rectangle Width");
        int Width = sc.nextInt();
        sc.close();

        int result = Length * Width;
        System.out.println("Area of Rectangle : " + result );
    }
}
