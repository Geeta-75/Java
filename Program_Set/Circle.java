package Program_Set;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Circle Radius ");
        int R = sc.nextInt();
        sc.close();
        double pai = 3.14;

        double Circle = pai * R*R;
        System.out.println("Area of Circle : " + Circle);
    }
    
}

// public class Circle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Circle Radius ");
//         int R = sc.nextInt();
//         int pai = 22 / 7;

//         int Circle = pai * R*R;
//         System.out.println("Area of Circle : " + Circle);
//     }
    
// }