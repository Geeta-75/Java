package Program_Set;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int num = sc.nextInt();
        int Square = num*num;
        sc.close();
        System.out.println("Square Number is " + num + " of " + Square);
    }
    
}
