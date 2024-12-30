package Program_Set;

import java.util.Scanner;

public class Maths_Formulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Triangle breath");
        int b = sc.nextInt();
        System.out.println("Enter the Triangle hight");
        int h = sc.nextInt();
        sc.close();
         int Triangle = b*h * 1/ 2 ;                      //      b = 5 , h = 7 -> 17.5

         System.out.println("Area of Triangle : " + Triangle);

    }
    
}
