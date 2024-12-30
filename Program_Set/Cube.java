package Program_Set;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int Cube = num*num*num;
        sc.close();
        System.out.println("Cube is " + num + " of " + Cube);
    }
    
}


