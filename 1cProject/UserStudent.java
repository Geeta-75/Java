import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserStudent {

	private static Scanner sc = new Scanner(System.in);
    private Student student;
    private DBManager dbManager;
    
	public UserStudent(Student student,DBManager dbManager){
        this.student = student;
        this.dbManager = dbManager;
    }
	
	
    public void getStudentMenu(){
        System.out.println("Student Menu");
        System.out.println("---------------");

        System.out.println("1. Course Details");
        System.out.println("2. Enroll in a course");
        System.out.println("3. Give Assessment");
//        System.out.println("4. Get Certificate");
        System.out.println("5. Exit");

        // Method to print the CProvider menu and run methods according to user choice
        System.out.print("Enter the corresponding number to select the option : ");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {
            case 1:
            	System.out.println("Here is the list of courses :");
            	System.out.println("-----------------------");
            	printCourses();
                break;
            case 2:
            	stEnrollment();
                break;
            case 3:
            	doAssessment();
                break;
            case 4:
                break;
            case 5:
            	studentExit();
                break;
            default:
            System.out.println("Please enter the valid option : ");
            getStudentMenu();
                break;
        }
    }
    
    public void printCourses(){
    	try {
    	List<Course> courses = dbManager.getCourses();
    	String hFormat = "| %8s | %-22s | %7s | %9s | %8s | %5s |%n";
		String format = "| %8d | %-22s | %7d | %2d months | %8d | %5d |%n";
        String lsFormat ="-%10s-%24s-%9s-%11s-%10s-%7s-\n";
//        String hFormat ="| %s | %" + nameWidth + "s | %" + rollWidth + "s | %"+conWidth+"s | %"+courseWidth+"s | %"+creditsWidth+"s |%n";
        System.out.printf(lsFormat,"-".repeat(10),"-".repeat(24),"-".repeat(9),"-".repeat(10),"-".repeat(10),"-".repeat(7));
        System.out.printf(hFormat,"CourseID","Course Name","credits","Duration","Capacity","Fees");
        System.out.printf(lsFormat,"-".repeat(10),"-".repeat(24),"-".repeat(9),"-".repeat(11),"-".repeat(10),"-".repeat(7));

    	for (Course course  : courses) {
    		System.out.printf(format,course.getCourseID(),course.getCourseName(),course.getCourseCreadits(),course.getDuration(),course.getCapacity(),course.getCFees());

         
        }
        System.out.printf(lsFormat,"-".repeat(10),"-".repeat(24),"-".repeat(9),"-".repeat(10),"-".repeat(10),"-".repeat(7));

    	}catch(SQLException e) {
    		System.out.print("Error while fetching data");
    		e.printStackTrace();
    	}
    	
    	getStudentMenu();
    	
    }
    
    public void stEnrollment() {
    	try {
    	Student student1 = dbManager.getStudent(student.getStudentID(),student.getStudentCon());
    	if(student1.getStCourseID()==404) {
    		System.out.print("To get Enroll into a course\nEnter the Course ID in which you want to enroll : ");
        	int courseID = sc.nextInt();
        	sc.nextLine();
        	Course course = dbManager.getCourses(courseID);
        	if(courseID==404) {
        		System.out.println("Invalid course ID");
        		stEnrollment();
        	}
        		  
        		  int result = dbManager.getEnroll(courseID, student.getStudentID());
        		  if(result==1) {
        			  System.out.println("Enrolled in "+course.getCourseName()+"course successfull");
        			  getStudentMenu();
        			  
        		  }else {
        			  System.out.println("CourseID is incorrect");
        			  stEnrollment();
        		  }
            }else {
            	System.out.println("You are already enrolled in a course");
            	getStudentMenu();
            	
                
            }
    	}catch(SQLException e) {
    		System.out.println("Error fetching data"+e.getMessage());
    	}
    	
    	}
    
      public void doAssessment() {
    	  try {
    	    	Student student1 = dbManager.getStudent(student.getStudentID(),student.getStudentCon());
    	    	boolean result;
    	    	switch(student1.getStCourseID()) {
    	    	case 201:
    	    		result = Assessment.assessment_DM();
    	    		if(result) {
    	    			dbManager.setCredits(4, student1.getStudentID());
    	    		}
    	    		break;
    	    	case 202:
    	    	    result = Assessment.assessment_UI_UX();
    	    		if(result) {
    	    			dbManager.setCredits(2, student1.getStudentID());
    	    		}
    	    		break;
    	    	case 203:
    	    		result = Assessment.assessment_IT();
    	    		if(result) {
    	    			dbManager.setCredits(8, student1.getStudentID());
    	    		}
    	    		break;
    	    	case 204:
    	    		result = Assessment.assessment_Python();
    	    		if(result) {
    	    			dbManager.setCredits(6, student1.getStudentID());
    	    		}
    	    		break;
    	    	 
    	    	 }
    	  }catch(SQLException e) {
      		System.out.println("Error fetching data"+e.getMessage());
      	}
    	 
      }
//    public void studyCourse() {
//    	try {
//    	Chapters chapter = dbManager.getChapters(student.getStCourseID());
//    	for (Chapters chapter  : chapters) {
//            System.out.println("Chapter Name : "+chapter.getChapterName());
//            System.out.println("----------------------------------");
//            System.out.println(chapter.getChapterDesc());
//            System.out.println("----------------------------------");
//        }
//    	}catch(SQLException e) {
//    		System.out.println("Error while fetching chapters");
//    		e.printStackTrace();
//    		
//    	}
//    	
//    	System.out.println("1.Give course assessment");
//    	System.out.println("2.Back to Menu");
//        System.out.print("Enter the corresponding number to select the option : ");
//        int choice = sc.nextInt();
//        sc.nextLine();
//        if(choice==1) {
//        	Assessment.getAssessment();
//        }else if(choice==2) {
//        	getStudentMenu();
//        }
//    	
//    }
    
    public void studentExit() {
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
    }
    	
    }
    
   
    

