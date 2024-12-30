package String;

import java.util.Scanner;

public class Remove_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String str = sc.nextLine();
        System.out.println("Enter the character ");
        char c = sc.next().charAt(0);
        System.out.println(removechar(str, c));
    
    
    }
    static String removechar(String s , char c){
        String r = "";
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != c){
                r = r +s.charAt(i);
            }
        }
        return r;

    }
    
}
