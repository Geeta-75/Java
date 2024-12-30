package Progect_C;

import java.util.Scanner;

public class LoginMenu {
    private static Scanner sc = new Scanner(System.in);
    private DBManager dbManager;
    private CProvider cProvider;
    private UserCP userCP;
    private UserStudent userSt;

    public LoginMenu() {
        this.dbManager = new DBManager();
    }

    public LoginMenu(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    // Other methods...

    public void signUpAsCProvider() {
        String cProviderName;
        String password;
        long contact;

        System.out.println("To SignUp as Course Provider :");
        System.out.println("Please enter your name : ");
        cProviderName = sc.nextLine();

        System.out.println("Please enter your Contact : ");
        while (true) {
            contact = sc.nextLong();
            sc.nextLine();
            if (isValidCon(contact)) {
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

        while (true) {
            String passCheck;
            char[] passCheckArray = console.readPassword("Create your password: ");
            passCheck = new String(passCheckArray);
            char[] passArray = console.readPassword("Re-enter your password: ");
            password = new String(passArray);

            if (passCheck.equals(password)) {
                if (isValidPassword(password)) {
                    try {
                        int result = dbManager.addCourseProvider(cProviderName, contact, password);
                        if (result == 1) {
                            cProvider = dbManager.getCProvider(contact, password);
                            userCP = new UserCProvider(cProvider, dbManager);
                            System.out.println("Sign Up successful\nWelcome! " + cProvider.getCProviderName());
                        }
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Invalid password format. Please try again.");
                }
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }
    }

    // Other methods...
}
