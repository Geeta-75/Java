package CProject;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserStudent {

	private static Scanner sc = new Scanner(System.in);
	private Student student;
	private DBManager dbManager;
    private CProvider cpInfo;
	public UserStudent(Student student,CProvider cpInfo, DBManager dbManager) {
		this.cpInfo = cpInfo;
		this.student = student;
		this.dbManager = dbManager;
	}

	public void getStudentMenu() {
		System.out.println("Student Menu");
		System.out.println("--------------------------------------");
		System.out.println("1. View your profile");
		System.out.println("2. View your Course Provider Details");
		System.out.println("3. View available Courses ");
		System.out.println("4. Enroll in a course");
		System.out.println("5. Give Assessment");
		System.out.println("6. Get Certificate");
		System.out.println("7. Exit");

		// Method to print the CProvider menu and run methods according to user choice
		System.out.print("Enter the corresponding number to select the option : ");
		int choice = sc.nextInt();
		sc.nextLine();
		System.out.println("----------------------------------------------");
		
		switch (choice) {
		case 1:
			System.out.println("Student Profile");
			try {
			Student stInfo =dbManager.getStudent(student.getStudentRoll(),student.getStudentCon());
			System.out.println("Student ID : "+stInfo.getStudentID());
			System.out.println("Student name : "+stInfo.getStudentName());
			System.out.println("Roll Number : "+stInfo.getStudentRoll());
			System.out.println("Contact : "+stInfo.getStudentCon());
			System.out.println("Course Enrolled : "+stInfo.getStudentCourse());
			System.out.println("Creadits Gained : "+stInfo.getStCreadits());
			System.out.println("----------------------------------------------");
			getStudentMenu();
			}catch(SQLException e) {
				System.out.println("Error while fetching student data");
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Your Course Provider Details");
			System.out.println("Course Provider ID : "+cpInfo.getCPID());
			System.out.println("Course Provider name : "+cpInfo.getCProviderName());
			System.out.println("Contact Number : "+cpInfo.getCPCon());
			System.out.println("----------------------------------------------");
			getStudentMenu();
			break;
		case 3:
			System.out.println("Here is the table of available courses :");
			printCourses();
			break;
		case 4:
			stEnrollment();
			break;
		case 5:
			doAssessment();
			break;
        case 6:
			getCertificate();
			break;
        case 7:
			studentExit();
			break;
		default:
			System.out.println("Please enter the valid option : ");
			getStudentMenu();
			break;
		}
	}

	public void printCourses() {
		try {
			List<Course> courses = dbManager.getCourses();
			String hFormat = "| %8s | %-22s | %7s | %9s | %8s | %5s |%n";
			String format = "| %8d | %-22s | %7d | %2d months | %8d | %5d |%n";
			String lsFormat = "------------------------------------------------------------------------------\n";
//        String hFormat ="| %s | %" + nameWidth + "s | %" + rollWidth + "s | %"+conWidth+"s | %"+courseWidth+"s | %"+creditsWidth+"s |%n";
			System.out.print(lsFormat);
			System.out.printf(hFormat, "CourseID", "Course Name", "credits", "Duration", "Capacity", "Fees");
			System.out.print(lsFormat);

			for (Course course : courses) {
				System.out.printf(format, course.getCourseID(), course.getCourseName(), course.getCourseCreadits(),
						course.getDuration(), course.getCapacity(), course.getCFees());

			}
			System.out.print(lsFormat);

		} catch (SQLException e) {
			System.out.print("Error while fetching data");
			e.printStackTrace();
		}

		getStudentMenu();

	}

	public void stEnrollment() {
		try {
			Student student1 = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			if (student1.getStCourseID() == 404) {
				System.out.print("To get Enroll into a course\nEnter the Course ID in which you want to enroll : ");
				int courseID = sc.nextInt();
				sc.nextLine();
				Course course = dbManager.getCourses(courseID);
				if (courseID == 404) {
					System.out.println("Invalid course ID");
					stEnrollment();
				}

				int result = dbManager.getEnroll(courseID, student.getStudentID());
				if (result == 1) {
					System.out.println("Enrolled in " + course.getCourseName() + " course successfull");
					getStudentMenu();

				} else {
					System.out.println("CourseID is incorrect");
					stEnrollment();
				}
			} else {
				System.out.println("You are already enrolled in a course");
				getStudentMenu();

			}
		} catch (SQLException e) {
			System.out.println("Error fetching data" + e.getMessage());
		}

	}

	public void doAssessment() {
		try {
			Student student1 = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			boolean result;
			switch (student1.getStCourseID()) {
			case 201:
				result = Assessment.assessment_DM();
				if (result) {
					dbManager.setCredits(4, student1.getStudentID());
					System.out.println("Congratulation " + student1.getStudentName()
							+ "\nYou have successfully compleated your assessment");
					getStudentMenu();
				} else {
					System.out.println("You haven't given all the correct answers\nPlease try again");
					getStudentMenu();
				}
				break;
			case 202:
				result = Assessment.assessment_UI_UX();
				if (result) {
					dbManager.setCredits(2, student1.getStudentID());
					System.out.println("Congratulation " + student1.getStudentName()
							+ "\nYou have successfully compleated your assessment");
					getStudentMenu();
				} else {
					System.out.println("You haven't given all the correct answers\nPlease try again");
					getStudentMenu();
				}
				break;
			case 203:
				result = Assessment.assessment_IT();
				if (result) {
					dbManager.setCredits(8, student1.getStudentID());
					System.out.println("Congratulation " + student1.getStudentName()
							+ "\nYou have successfully compleated your assessment");
					getStudentMenu();
				} else {
					System.out.println("You haven't given all the correct answers\nPlease try again");
					getStudentMenu();
				}
				break;
			case 204:
				result = Assessment.assessment_Python();
				if (result) {
					dbManager.setCredits(6, student1.getStudentID());
					System.out.println("Congratulation " + student1.getStudentName()
							+ "\nYou have successfully compleated your assessment");
					getStudentMenu();
				} else {
					System.out.println("You haven't given all the correct answers\nPlease try again");
					getStudentMenu();
				}
				break;
			case 404 :
				System.out.println("You haven't enrolled in any course to give assessment \nplease enroll in a course first");
				getStudentMenu();
				break;
			}

		} catch (SQLException e) {
			System.out.println("Error fetching data" + e.getMessage());
		}

	}

	public void getCertificate() {
		try {
			
			Student student1 = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			Course courseInfo = dbManager.getCourses(student1.getStCourseID());
			if (student1.getStCourseID() != 404) {
				if (courseInfo.getCourseCreadits() == student1.getStCreadits()) {
					System.out.println("Congratulation " + student1.getStudentName()
							+ "\nYou have successfully compleated your assessment\nHere is your certificate");
					int totalWidth = 48;
					String lsFormat = "-%" + totalWidth + "s-\n";
					String format = "| %"+totalWidth+"s |\n";
					int x = (totalWidth + "CERTIFICATE OF COMPLEATION".length())/2;
					String xformat = "| %"+x+"s%s |\n";

					System.out.printf(lsFormat, "-".repeat(totalWidth + 2));
					System.out.printf(format,"Sant Singaji Institute of Science and Management");
					System.out.printf(format," ".repeat(48));

					System.out.printf(format,"CERTIFICATE OF COMPLEATION"+" ".repeat(totalWidth-37));
					System.out.printf(format," ".repeat(48));

					System.out.printf(format,"This is to certify that"+" ".repeat(totalWidth-34));
					System.out.printf(format,student1.getStudentName()+" ".repeat(totalWidth/2-student1.getStudentName().length()/2));
					System.out.printf(format,"has compleated the course of"+" ".repeat(totalWidth-39));
					System.out.printf(format,student1.getStudentCourse()+" ".repeat((totalWidth)/2-(student1.getStudentCourse().length()/2)));
					System.out.printf(format," ".repeat(48));
					System.out.printf(format," ".repeat(48));

					System.out.printf(format,"HOD                         Principle      ");
					System.out.printf(format," ".repeat(48));
					System.out.printf(lsFormat, "-".repeat(totalWidth + 2));
                    getStudentMenu();


					
					
				}else {
					System.out.println("You haven't given the assessment \nPlease compleate the assessment first");
					getStudentMenu();
				}
			}else {
				System.out.println("You haven't enrolled in any courses \nPlease enroll in a course first");
				getStudentMenu();
			}
		} catch (SQLException e) {

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

	public static int getMax(int a, int b) {
		if (a >= b) {
			return a;
		} else {
			return b;
		}
	}

	public void studentExit() {
		System.out.println("1. Go to Login/Signup menu");
		System.out.println("2.Close the programe");
		System.out.print("Enter the corresponding number to select the option : ");
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