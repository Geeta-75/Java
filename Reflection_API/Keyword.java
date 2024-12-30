package Reflection_API;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Keyword {
    public static void main(String[] args) throws Exception {
        String s1 = "Login";
        String s2 = "Logout";
        String s3 = "resigter";

        // Retrive the method - getMethod()
        Method m = Keyword.class.getMethod(s1);
        // call the Method
        m.invoke(m);

    }

    public static void Login() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome ! Login Process Start - 1. Yes 2. No");
        int ch = s.nextInt();
        if (ch == 1) {
            System.out.println("Enter the Password");
            int id = s.nextInt();
            System.out.println("Enter the username ");
            String Name = s.nextLine();
        } else {
            System.out.println("ok.. Not Problem");
        }
    }

    public static void Logout() {

    }

    public static void resigter() {

    }

}
