package String;

import java.util.Scanner;

public class Lower_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("Original Name : " + str);
        String toLower = str.toLowerCase();
        System.out.println("Lowercase characters of string : " + toLower);
    }
}
