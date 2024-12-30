package String;

import java.util.Scanner;

public class charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        System.out.println("Enter the Index value ");
        int n = sc.nextInt();
        char ch = str.charAt(n);
        System.out.println(" characters at index position  : " + ch);
    }

}
