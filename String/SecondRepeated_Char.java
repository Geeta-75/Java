package String;

import java.util.Scanner;

public class SecondRepeated_Char {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            for (int j = i + 1; j < name.length(); j++) {
                if (name.charAt(i) == name.charAt(j)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(name.charAt(i));
                break;
            }
            count = 0;
        }
    }
}
