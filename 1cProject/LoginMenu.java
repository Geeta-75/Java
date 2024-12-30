import java.io.Console;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.sql.SQLException;

public class LoginMenu {
    private static Scanner sc = new Scanner(System.in);
    private DBManager dbManager;
    private CProvider cProvider;
    private UserCProvider userCP;
    private UserStudent userSt;
    

    // LoginMenu Constructor
    public LoginMenu() {
        this.dbManager = new DBManager();
    }
    
    public LoginMenu(DBManager dbManager) {
        this.dbManager = dbManager;
    }

    // Method to get user input
    

    // Method to to get the User Choice to get Login/Sign Up as Student or Course
    public void getHomeMenu(){
        System.out.println("Login/SignUp Menu");
        System.out.println("---------------------------");
        System.out.println("1. Login as Course Provider");
        System.out.println("2. SignUp as Course Provider");
        System.out.println("---------------------------");
        System.out.println("3. Login as Student");
        System.out.println("4. Exit");

        System.out.print("Enter the corresponding number to select the option : ");

        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                loginAsCProvider();
                break;
            case 2:
                signUpAsCProvider();
                break;
            case 3:
                loginAsStudent();
                break;
            case 4:
            	systemClose();
                break;
            default:
                System.out.println("Please enter the valid option : ");
                getHomeMenu();
                break;
        }
    }

    // Method to Get Sign Up details
    public void signUpAsCProvider() {
        String cProviderName;
        String password;
        long contact;

        System.out.println("To SignUp as Course Provider :");
        System.out.println("Please enter your name : ");
        cProviderName = sc.nextLine();

        System.out.println("Please enter your Contact : ");
        // Looping until get the valid contact input
        while (true) {
            contact = sc.nextLong();
            sc.nextLine();
            if (isValidCon(contact)) {
                break;
            } else {
                System.out.println("Please enter valid contact\nRe-enter your contact : ");
            }
        }

        // Console object to call the readPassword method of Console class
        Console console = System.console();
        
        if (console == null) {
            System.out.println("No console available");
            return;
        }    
        // looping until get the valid password
        while (true) {
            String passCheck;
            //System.out.print("Create your password: ");
            char[] passCheckArray = console.readPassword("Create your password: ");
            passCheck = new String(passCheckArray);
            // System.out.print("Re-enter your password: ");
            char[] passArray = console.readPassword("Re-enter your password: ");
            password = new String(passArray);

            // checks if both the entered password matches
            if (passCheck.equals(password)) {
                // check if password entered is valid
                if (isValidPassword(password)) {
                    try {
                        int result = dbManager.addCourseProvider(cProviderName, contact, password);
                        if(result == 1) {
                        	try {
                               cProvider = dbManager.getCProvider(contact, password);
                               userCP = new UserCProvider(cProvider,dbManager);
                               System.out.println("Sign Up successful\nWelcome! "+cProvider.getCProviderName());
                               userCP.getCProviderMenu();

                            } catch (SQLException e) {
                               System.out.println("Error while fetching data "+e.getMessage());

                            }
                        }

                    } catch (SQLException e) {
                        System.out.println("Error while Creating account to database: " + e.getMessage());
                    }

                    break;

                } else {
                    System.out.println("Password must be at least 8 characters long, contain at least one uppercase letter, one lowercase letter, and one digit.");
                }
            } else {
                System.out.println("Password doesn't match");
            }
        }
        
        



    }

    // Method to get Course Provider login
    public void loginAsCProvider() {
        String password;
        long contact;
        int userCheck;
        System.out.println("Please enter your Contact : ");
        // Looping until get the valid contact input
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
        
        // Looping until get valid password
        while (true) {
            //System.out.print("Enter your password: ");
            char[] passArray = console.readPassword("Enter your password: ");
            password = new String(passArray);

            try {
                userCheck = dbManager.checkCourseProvider(contact, password);
                if (userCheck == 1) {
                    break;
                } else if (userCheck == 2) {
                    System.out.println("Incorrect Password !!\nPlease try again");
                }else if(userCheck==3){
                    break;
                }

            } catch (SQLException e) {
                System.out.println("Error while fetching the data" + e.getMessage());
            }
        }
        // Checking if the contact doesn't match with the database 
        if (userCheck == 3) {
            System.out.println("Incorrect Contact number ");
            loginAsCProvider();
        }
        
        try {
            cProvider = dbManager.getCProvider(contact, password);
            userCP = new UserCProvider(cProvider,dbManager);
            
            System.out.println("Login successfull\nWelcome! "+cProvider.getCProviderName());
            System.out.println("-----------------------------");

            userCP.getCProviderMenu();
 
         } catch (SQLException e) {
            System.out.println("Error while fetching data "+e.getMessage());
 
         }

    }
    
    //Method to get login as Student;
    public void loginAsStudent() {
    	int stRoll;
    	long stCon;
    	
        System.out.println("Enter your Roll Number : ");
        stRoll = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter your Contact Number : ");
        while(true) {
        	stCon = sc.nextLong();
        	sc.nextLine();
        	if(isValidCon(stCon)) {
        		break;
        	}else {
        		System.out.println("Enter valid contact number");
        	}
        }
        
        try {
        	if(dbManager.checkStudent(stRoll, stCon)) {
        		System.out.println("Login successfuly");
        		try {
        	         Student student = dbManager.getStudent(stRoll, stCon);
//        	         Course course = dbManager.getCourses(student.getStCourseID());
        	        userSt = new UserStudent(student,dbManager);
        	        userSt.getStudentMenu();
        	        }catch(SQLException e) {
        	        	System.out.println("No data Found");
        	        	e.printStackTrace();
        	        }
        	}else{
        		System.out.println("Invalid details......\nPlease try again");
        		loginAsStudent();
        	}
        }catch(SQLException e) {
        	System.out.println("Error while Student Login");
        	e.printStackTrace();
        }
        
        
        
    }

    // Method to validate the Contact
    public static boolean isValidCon(long contact) {
        String stringCon = String.valueOf(contact);
        String conPattern = "^[6-9][0-9]{9}$";
        return Pattern.matches(conPattern, stringCon);
    }

    // Method to validate the password
    private static boolean isValidPassword(String password) {
        String passPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
        return Pattern.matches(passPattern, password);
    }

    // Method to validate the Roll Number
    public static boolean isValidRoll(int stRoll) {
        String roll = String.valueOf(stRoll);
        String passPattern = "^[0-9]{4}$";
        return Pattern.matches(passPattern, roll);
    }
    
    public static void systemClose() {
    	System.out.print("Thank for using our Programe\nGoodbye!!!");
    	System.exit(0);
    }


    public static void main(String[] args) {
        LoginMenu lm = new LoginMenu();
        lm.getHomeMenu();
    }
}