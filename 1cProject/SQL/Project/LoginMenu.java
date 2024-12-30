package Project;

import java.io.Console;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

import CProject.UserCProvider;

public class LoginMenu {
    private static Scanner sc = new Scanner(System.in);

    // Constructor
    public LoginMenu() {}

    // Main Menu for Login/Sign Up
    public void showMenu() {
        System.out.println("Welcome to the Login/Sign Up System");
        System.out.println("1. Login as Course Provider");
        System.out.println("2. Sign Up as Course Provider");
        System.out.println("3. Login as Student");
        System.out.println("4. Sign Up as Student");
        System.out.println("5. Exit");
        System.out.print("Select an option: ");
        
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                login("Course Provider");
                break;
            case 2:
                signUp("Course Provider");
                break;
            case 3:
                loginAsStudent("Student");
                break;
            case 4:
                signUp("Student");
                break;
            case 5:
                System.out.println("Thank you! Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid option, please try again.");
                showMenu();
                break;
        }
    }

      public void login() {
        String password;
        long contact;
        int userCheck;
        System.out.println("Please enter your Contact : ");
        // Looping until get the valid contact input
        while (true) {
            contact = sc.nextLong();
            sc.nextLine();
            if (isValidContact(contact)) {
                break;
            } else {
                System.out.println("Please enter valid contact\nRe-enter your contact : ");
            }
        }

        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available");
            return;
        }       
        
         }

    private void signUp(String userType) {
        System.out.println("Sign Up as " + userType);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your contact number: ");
        long contact = sc.nextLong();
        sc.nextLine(); 

        if (!isValidContact(contact)) {
            System.out.println("Invalid contact number. Please try again.");
            signUp(userType);
            return;
        }

        System.out.print("Create your password: ");
        String password = sc.nextLine();

        if (!isValidPassword(password)) {
            System.out.println("Password must be at least 8 characters long and contain a mix of uppercase, lowercase, and digits.");
            signUp(userType);
            return;
        }

        System.out.println("Sign Up successful! Welcome, " + name + " (" + userType + ")");
    }

    // Method to validate Contact Number
    private boolean isValidContact(long contact) {
        String conPattern = "^[6-9][0-9]{9}$";
        return Pattern.matches(conPattern, String.valueOf(contact));
    }

    // Method to validate Password
    private boolean isValidPassword(String password) {
        String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
        return Pattern.matches(passPattern, password);
    }

    public static void main(String[] args) {
        LoginMenu lm = new LoginMenu();
        lm.showMenu();
    }
}
