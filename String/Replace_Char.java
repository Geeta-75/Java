package String;

import java.util.Scanner;

public class Replace_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str2 = sc.nextLine();
        System.out.println("Enter the change character ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the new character ");
        char c = sc.next().charAt(0);

        str2 = str2.replace(ch, c);
        System.out.println("Replace Character : " + str2);
    }
}
