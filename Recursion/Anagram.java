package Recursion;

import java.util.Scanner;

public class Anagram {
    static void anagram(char[] str, char[] str2, int count, int i) {
        if (i < 0) {
            if (count == str2.length && count == str2.length) {
                System.out.println("Anagram");
            } else {
                System.out.println("not anagram");
            }
            return;
        }
        for (int j = 0; j < str2.length; j++) {
            if (str[i] == str2[j]) {
                count++;
                break;
            }
        }
        anagram(str, str2, count, i - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str = sc.nextLine();
        System.out.println("Enter the Second String");
        String str2 = sc.nextLine();
        int count = 0;
        char[] Array = str.toCharArray();
        char[] Array2 = str2.toCharArray();

        anagram(Array, Array2, count, Array.length - 1);

    }

}
