package Recursion;

import java.util.Scanner;

public class Reverse_String {
    public static void rev (String s , int i){
        if(s.length() == i){
            return;
        }
        rev(s, i + 1);
        System.out.println(s.charAt(i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name ");
        String str = sc.nextLine();
        rev(str, 0);
    }
}
