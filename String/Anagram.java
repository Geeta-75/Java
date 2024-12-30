package String;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str = sc.nextLine();
        System.out.println("Enter the Second String");
        String str2 = sc.nextLine();

        int count = 0;
        char[] a = str.toCharArray();
        char[] a2 = str2.toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                if (a[i] == a2[j]) {
                    count++;
                }
        }

        if (count == str.length() && count == str2.length()) {
            System.out.println("Anagram ");
        } else {
            System.out.println("not a Anagram");
        }
    }
}
