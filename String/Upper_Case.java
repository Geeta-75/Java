package String;

import java.util.Scanner;

public class Upper_Case {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("Original Name : " + str);
        String toUpper = str.toUpperCase();
        System.out.println("Uppercase characters of string : " + toUpper);
    }
}
