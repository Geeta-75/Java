package Project;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    System.out.println("WELCOME ..... ('_')");
    System.out.println("------------------------------------------------------");
    System.out.println(" Menu ");
    System.out.println("1. Signup as a course provider");
    System.out.println("2. Login as a course provider");
    System.out.println("3. Signup as a Student ");
    System.out.println("4. Login as a Student");
    System.out.println("5. Remove as a Student");
    System.out.println("Enter Your Choice.......");
    int choice = sc.nextInt();

    switch (choice) { 

        case 1:  
        SignupASProvider();
        break;
        
        case 2: 
        LoginAsProvider();
        break ;

        case 3:
        SignupAsStudent();

        case 4:
        loginAsStudent();

        case 5: 
        Remove();
        break;

        default:
        System.out.println("Invalid");
        break;

    }
}
