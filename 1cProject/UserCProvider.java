import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
public class UserCProvider {
    private static Scanner sc = new Scanner(System.in);
    private CProvider cProvider;
    private DBManager dbManager;

    //UserCProvider Constructor (Copy Constructor)
    public UserCProvider (CProvider cProvider,DBManager dbManager){
        this.cProvider=cProvider;
        this.dbManager = dbManager;
    }
    
    public void getCProviderMenu(){
        System.out.println("Course Provider Menu");
        System.out.println("-----------------------");

        System.out.println("1. Get Student Details");
        System.out.println("2. Get Student Details with Specific Course");
        System.out.println("3. Get Student Details who is not enrolled in any course");
        System.out.println("4. Add Student");
        System.out.println("5. Remove Student");
        System.out.println("6. Exit");

        // Method to print the CProvider menu and run methods according to user choice
        System.out.print("Enter the corresponding number to select the option : ");
        int choice = sc.nextInt();
        sc.nextLine();
    	System.out.println("---------------------------------");
        
        switch (choice) {
            case 1:
            	System.out.println("\nHere is the table of your students");
            	printStudent();
                break;
            case 2:
            	System.out.print("Enter the course ID, you want to get students of :");
            	int courseID = sc.nextInt();
            	sc.nextLine();
            	if(courseID==404) {
            		System.out.println("Invalid Course ID");
            		getCProviderMenu();
            	}else {
            	System.out.println("\nHere is the table of students who enrolled with course ID "+courseID);
                printStudent(courseID);
            	}
                break;
            case 3:
            	System.out.println("\nHere is the table of students who haven't enrolled in any course :");
            	printStudent(404);
                break;
            case 4:
            	addStudent();

                break;
            case 5:
            	removeStudent();
                break;
            case 6:
            	cProviderExit();
                break;
            default:
            System.out.println("Please enter the valid option : ");
            getCProviderMenu();
                break;
        }
    }

    
    public void printStudent(){
    	try {
    	List<Student> students = dbManager.getStudent(cProvider.getCPID());
    	int idWidth = "st.ID".length();
    	int nameWidth = "Student Name".length();
        int rollWidth = "Roll No.".length();
        int conWidth = 10;
        int courseWidth = "Enrolled Course".length();
        int creditsWidth = "Creadits".length();
        for (Student student : students) {
            idWidth = getMax(idWidth, String.valueOf(student.getStudentID()).length());
            nameWidth = getMax(nameWidth, student.getStudentName().length());
            courseWidth = getMax(courseWidth,student.getStudentCourse().length());
        }
        int totalStWidth = ((idWidth+nameWidth+rollWidth+conWidth+courseWidth+creditsWidth+19)-String.valueOf(students.size()).length()-("| Total number of students : ".length()));
        String format = "| %" + idWidth + "d | %-" + nameWidth + "s | %" + rollWidth + "d | %"+conWidth+"d | %"+courseWidth+"s | %"+creditsWidth+"d |%n";
        String lsFormat ="-%" + idWidth + "s-%" + nameWidth + "s-%" + rollWidth + "s-%"+conWidth+"s-%"+courseWidth+"s-%"+creditsWidth+"s-%n";
        String hFormat ="| %" + idWidth + "s | %-" + nameWidth + "s | %" + rollWidth + "s | %"+conWidth+"s | %"+courseWidth+"s | %"+creditsWidth+"s |%n";
        String tStFormat = "| Total number of students : %"+totalStWidth+"d |%n";
        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));
        System.out.printf(hFormat, "st.ID", "Student Name", "Roll No.","Contact","Enrolled Course","Credits");
        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));


        for (Student student : students) {
            System.out.printf(format, student.getStudentID(), student.getStudentName(), student.getStudentRoll(), student.getStudentCon(), student.getStudentCourse(), student.getStCreadits());
        }
        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));
    	System.out.printf(tStFormat,students.size());
        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));

    	}catch(SQLException e) {
    		System.out.print("Error while fetching data");
    		e.printStackTrace();
    	}
    	    	getCProviderMenu();
    	
    }
    
    public void printStudent(int courseID){
    	try {
    	List<Student> students = dbManager.getStudent(cProvider.getCPID());
		int count = 0;
		String courseName = null;
		if(students.size()!=0){
		
			int idWidth = "st.ID".length();
	    	int nameWidth = "Student Name".length();
	        int rollWidth = "Roll No.".length();
	        int conWidth = 10;
	        int courseWidth = "Enrolled Course".length();
	        int creditsWidth = "Creadits".length();
	        

	        for (Student student : students) {
	            nameWidth = getMax(nameWidth, student.getStudentName().length());
	            courseWidth = getMax(courseWidth,student.getStudentCourse().length());
	            count++;
                courseName = student.getStudentCourse();
	        }
	        int totalStWidth = ((idWidth+nameWidth+rollWidth+conWidth+courseWidth+creditsWidth+12+5)-("| Total number of students : ".length()));
	        String lsFormat ="-%" + idWidth + "s-%" + nameWidth + "s-%" + rollWidth + "s-%"+conWidth+"s-%"+courseWidth+"s-%"+creditsWidth+"s-%n";
	        String hFormat ="| %" + idWidth + "s | %-" + nameWidth + "s | %" + rollWidth + "s | %"+conWidth+"s | %"+courseWidth+"s | %"+creditsWidth+"s |%n";
	        String format = "| %-" + idWidth + "d | %" + nameWidth + "s | %" + rollWidth + "d | %"+conWidth+"d | %"+courseWidth+"s | %"+creditsWidth+"d |%n";
	        String tStFormat = "| Total number of students : %"+totalStWidth+"d |%n";

	        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));
	        System.out.printf(hFormat, "st.ID", "Student Name", "Roll No.","Contact","Enrolled Course","Credits");
	        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));


    	for (Student student : students) {
    		if(student.getStCourseID()==courseID) {
    	        System.out.printf(format, student.getStudentID(), student.getStudentName(), student.getStudentRoll(), student.getStudentCon(), student.getStudentCourse(), student.getStCreadits());
    	       
    		}            
            
    	}
        System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));
            if(count>0) {
            	System.out.printf(tStFormat, count);
                System.out.printf(lsFormat,"-".repeat(idWidth + 2), "-".repeat(nameWidth + 2), "-".repeat(rollWidth + 2),"-".repeat(conWidth + 2),"-".repeat(courseWidth + 2),"-".repeat(creditsWidth + 2));

        	}
		}else {
			System.out.println("No student found in your table\nPlease add students to get the information");
			getCProviderMenu();
		}
    	    
    	
    	}catch(SQLException e) {
    		System.out.print("while fetching data");
    		e.printStackTrace();
    	}
    	getCProviderMenu();
    	
    }
    
    
    
    public void addStudent() {
        String studName;
        int stRoll;
        long stCon;
        
        System.out.print("Enter student name: ");
        studName = sc.nextLine(); 
       
        // Looping until get the valid roll number input
        while (true) {
            System.out.println("Enter student Roll Nuumber : ");
            stRoll = sc.nextInt();
            sc.nextLine();
            if(LoginMenu.isValidRoll(stRoll)){
                break;
            }else{
                System.out.println("Student Roll Number can only contains four digits");
            }
        }

        
        while (true) {
            System.out.println("Enter student contact number : ");
            stCon = sc.nextLong();
            sc.nextLine();
            if(LoginMenu.isValidCon(stCon)){
               break;
            }else{
                System.out.println("Enter valid contact");
            }
        }
        
        //Created a Student object from user input to pass into the addStudentInfo method
        Student student = new Student(studName,stRoll,stCon);
        try {
            int result = dbManager.addStudent(student,cProvider.getCPID());
            if(result==1){
                System.out.println("Student added successfuly");
                System.out.println("------------------------------");
                getCProviderMenu();
            }else{
                System.out.println("Error while inserting data");
                addStudent();
            }
        } catch (SQLException e) {
            System.out.println("Error adding student: " + e.getMessage()+"\nTry again");
            addStudent();
        }
        
    }
    
    public void removeStudent() {
        System.out.print("Enter the student roll number to remove: ");
        int stRoll = sc.nextInt();
        sc.nextLine();

        try {
            int result = dbManager.removeStudent(stRoll, cProvider.getCPID());
            if (result==1) {
                System.out.println("Student removed successfully");
            } else {
                System.out.println("Error while removing student");
            }
        } catch (SQLException e) {
            System.err.println("Error removing student: " + e.getMessage());
        }
        getCProviderMenu();

    }
    
    public static int getMax(int a, int b) {
    	if(a>=b) {
    		return a;
    	}else {
    		return b;
    	}
    }
    public void cProviderExit() {
        System.out.println("1. Go to Login/Signup menu");
        System.out.println("2.Close the programe");
        System.out.print("Enter the corresponding number to select the option : ");
        int choice = sc.nextInt();
        sc.nextLine();
    	System.out.println("---------------------------------");
        if(choice==1){
            LoginMenu lMenu = new LoginMenu(dbManager);
            lMenu.getHomeMenu();
        }else if(choice == 2){
            LoginMenu.systemClose();
        }
    }}
