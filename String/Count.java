package String;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.length() == i ) {
                count++;
            }
        }
        System.out.println(count);
    }

}
