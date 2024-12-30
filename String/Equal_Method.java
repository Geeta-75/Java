package String;

import java.util.Scanner;

public class Equal_Method {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name ");
        String str = sc.nextLine();
        System.out.println("Enter the Second  Name ");
        String str2 = sc.nextLine();

        String name = str + " and " + str2; 
        System.out.println("-----------------------------------------------");

        if(str.equals(str2))
        {
            System.out.println("Both are equals : " + name);
        }
        else{
            System.out.println("Not equal");
        }
    }
    
}
