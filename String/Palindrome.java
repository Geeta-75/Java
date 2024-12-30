package String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str = sc.nextLine();
        String r = "";
        for(int i = str.length()-1 ; i >= 0 ; i-- )
        {
            r = r + str.charAt(i);
        }
        if(str.equals(r) || str.equalsIgnoreCase(r))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        
        
    }
}
