package String;

import java.util.Scanner;

public class String_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String str = sc.nextLine();

        System.out.println(" Capital Letter -Name : " + str.toUpperCase());
        System.out.println("  Small Letter -Name : " + str.toLowerCase());
        System.out.println("   Length of Name :  " + str.length());

    }
}
