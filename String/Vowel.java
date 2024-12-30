package String;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int Vowel = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'
                    || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'U')
                Vowel++;

        }
        System.out.println("Count the Vowels : Check it -> " + Vowel);

    }
}
