package Project;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import CProject.CProvider;
import CProject.DBManager;
import CProject.Student;

public class CourseProvider {
    private static Scanner sc = new Scanner(System.in);
    private CProvider cProvider;
    private DBManager dbManager;

    // Constructor
    public CourseProvider(CProvider cProvider, DBManager dbManager) {
        this.cProvider = cProvider;
        this.dbManager = dbManager;
    }

    public void getCProviderMenu() {
        System.out.println("Course Provider Menu");
        System.out.println("1. Get Student Details");
        System.out.println("2. Get Student Details with Specific Course");
        System.out.println("3. Get Student Details who is not enrolled in any course");
        System.out.println("4. Add Student");
        System.out.println("5. Remove Student");
        System.out.println("6. Exit");
    
        int choice = sc.nextInt();
        sc.nextLine(); // scanner ke baad `nextInt` ke baad extra new line hataane ke liye
        System.out.println("---------------------------------");
    
        // Switch-case se user ke choice ke basis par action perform hota hai
        switch (choice) {
            case 1:
                printStudent(); // saare students ko dikhata hai
                break;
            case 2:
                // Specific course ke students ko dikhata hai
                System.out.print("Enter the course ID: ");
                int courseID = sc.nextInt();
                sc.nextLine();
                System.out.println("-----------------------------------");
                if (courseID == 404) {
                    System.out.println("Invalid Course ID");
                    getCProviderMenu();
                } else {
                    printStudent(courseID);
                }
                break;
            case 3:
                printStudent("Not enrolled"); 
                break;
            case 4:
                addStudent(); // Add New Student
                break;
            case 5:
                removeStudent(); // Remove Student
                break;
            case 6:
                cProviderExit(); 
                break;
            default:
                System.out.println("Please enter the valid option");
                getCProviderMenu();
                break;
        }
    }
    public void printStudent() {
    try {
        List<Student> students = dbManager.getStudent(cProvider.getCPID());
        // Student details print karta hai
    } catch (SQLException e) {
        System.out.print("Error while fetching data");
        e.printStackTrace();
    }
    getCProviderMenu();
}

public void printStudent(int courseID) throws SQLException {
    getCProviderMenu();
}

public void printStudent(String enStatus) throws SQLException {
    getCProviderMenu();
}

public void addStudent() {
    String studName;
    int stRoll;
    long stCon;

    System.out.print("Enter student name: ");
    studName = sc.nextLine();

    // Roll number validate karte hain
    while (true) {
        System.out.println("Enter student Roll Number: ");
        stRoll = sc.nextInt();
        sc.nextLine();
        if (LoginMenu.isValidRoll(stRoll)) {
            break;
        } else {
            System.out.println("Student Roll Number can only contain four digits");
        }
    }

    // Contact number validate karte hain
    while (true) {
        System.out.println("Enter student contact number: ");
        stCon = sc.nextLong();
        sc.nextLine();
        if (LoginMenu.isValidCon(stCon)) {
            break;
        } else {
            System.out.println("Enter valid contact");
        }
    }

    // Student object banate hain aur database mein add karte hain
    Student student = new Student(studName, stRoll, stCon);
    try {
        int result = dbManager.addStudent(student, cProvider.getCPID());
        if (result == 1) {
            System.out.println("Student added successfully");
            System.out.println("------------------------------");
            getCProviderMenu();
        } else {
            System.out.println("Error while inserting data");
            addStudent();
        }
    } catch (SQLException e) {
        System.out.println("Error adding student: " + e.getMessage() + "\nTry again");
        addStudent();
    }
}
public void removeStudent() {
    System.out.print("Enter the student roll number to remove: ");
    int stRoll = sc.nextInt();
    sc.nextLine();

    try {
        int result = dbManager.removeStudent(stRoll, cProvider.getCPID());
        if (result == 1) {
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Error while removing student");
        }
    } catch (SQLException e) {
        System.err.println("Error removing student: " + e.getMessage());
    }
    getCProviderMenu();
}
public void cProviderExit() {
    System.out.println("1. Go to Login/Signup menu");
    System.out.println("2.Close the program");
    System.out.print("Enter the corresponding number to select the option: ");
    int choice = sc.nextInt();
    sc.nextLine();
    System.out.println("---------------------------------");

    if (choice == 1) {
        LoginMenu lMenu = new LoginMenu(dbManager);
        lMenu.getHomeMenu();
    } else if (choice == 2) {
        LoginMenu.systemClose();
    }
}



    
}


