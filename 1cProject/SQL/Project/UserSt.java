package Project;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserSt {

	private static Scanner sc = new Scanner(System.in);
	private Student student; // Current student object
	private dbManager DBManager; // Database manager object
	private CourseProvider cpInfo; // Course provider object
	
	// Constructor to initialize the student, course provider and DB manager
	public UserSt(Student student, CourseProvider cpInfo, dbManager dbManager) {
		this.cpInfo = cpInfo;
		this.student = student;
		this.DBManager = dbManager;
	}

	// Method to display the student menu and perform actions based on user choice
	public void getStudentMenu() {
		System.out.println("Student Menu");
		System.out.println("1. View your profile");
		System.out.println("2. View your Course Provider Details");
		System.out.println("3. View available Courses");
		System.out.println("4. Enroll in a course");
		System.out.println("5. Give Assessment");
		System.out.println("6. Get Certificate");
		System.out.println("7. Exit");

		System.out.print("Enter your choice: ");
		int choice = sc.nextInt(); // User choice input
		sc.nextLine(); // Clear the buffer
		
		switch (choice) {
			case 1:
				viewProfile(); // View student profile
				break;
			case 2:
				viewCourseProviderDetails(); // View course provider details
				break;
			case 3:
				printCourses(); // Print available courses
				break;
			case 4:
				stEnrollment(); // Enroll in a course
				break;
			case 5:
				doAssessment(); // Give assessment
				break;
			case 6:
				getCertificate(); // Get certificate
				break;
			case 7:
				studentExit(); // Exit
				break;
			default:
				System.out.println("Please enter a valid option.");
				getStudentMenu();
		}
	}

	// Method to view student profile
	private void viewProfile() {
		try {
			Student stInfo = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			System.out.println("Student ID: " + stInfo.getStudentID());
			System.out.println("Name: " + stInfo.getStudentName());
			System.out.println("Roll Number: " + stInfo.getStudentRoll());
			System.out.println("Contact: " + stInfo.getStudentCon());
			System.out.println("Course Enrolled: " + stInfo.getStudentCourse());
			System.out.println("Credits Gained: " + stInfo.getStCreadits());
		} catch (SQLException e) {
			System.out.println("Error while fetching student data.");
			e.printStackTrace();
		}
		getStudentMenu();
	}

	// Method to view course provider details
	private void viewCourseProviderDetails() {
		System.out.println("Course Provider ID: " + cpInfo.getCPID());
		System.out.println("Name: " + cpInfo.getCProviderName());
		System.out.println("Contact: " + cpInfo.getCPCon());
		getStudentMenu();
	}

	// Method to print available courses
	private void printCourses() {
		try {
			List<Course> courses = dbManager.getCourses();
			System.out.printf("| %8s | %-22s | %7s | %9s | %8s | %5s |\n", "CourseID", "Course Name", "Credits", "Duration", "Capacity", "Fees");
			System.out.println("------------------------------------------------------------------------------");

			for (Course course : courses) {
				System.out.printf("| %8d | %-22s | %7d | %2d months | %8d | %5d |\n",
					course.getCourseID(), course.getCourseName(), course.getCourseCreadits(),
					course.getDuration(), course.getCapacity(), course.getCFees());
			}
		} catch (SQLException e) {
			System.out.println("Error while fetching data.");
			e.printStackTrace();
		}
		getStudentMenu();
	}

	// Method to enroll in a course
	private void stEnrollment() {
		try {
			Student student1 = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			if (student1.getStCourseID() == 404) {
				System.out.print("Enter the Course ID to enroll: ");
				int courseID = sc.nextInt();
				sc.nextLine();
				Course course = dbManager.getCourses(courseID);
				if (courseID == 404) {
					System.out.println("Invalid course ID.");
					stEnrollment();
				}

				int result = dbManager.getEnroll(courseID, student.getStudentID());
				if (result == 1) {
					System.out.println("Enrolled in " + course.getCourseName() + " successfully.");
				} else {
					System.out.println("Course ID is incorrect.");
					stEnrollment();
				}
			} else {
				System.out.println("You are already enrolled in a course.");
			}
		} catch (SQLException e) {
			System.out.println("Error fetching data: " + e.getMessage());
		}
		getStudentMenu();
	}

	// Method to give assessment
	private void doAssessment() {
		try {
			Student student1 = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			boolean result;
			switch (student1.getStCourseID()) {
				case 201:
					result = Assessment.assessment_DM();
					if (result) {
						dbManager.setCredits(4, student1.getStudentID());
						System.out.println("Congratulations, you have successfully completed your assessment.");
					} else {
						System.out.println("Incorrect answers, please try again.");
					}
					break;
				case 202:
					result = Assessment.assessment_UI_UX();
					if (result) {
						dbManager.setCredits(2, student1.getStudentID());
						System.out.println("Congratulations, you have successfully completed your assessment.");
					} else {
						System.out.println("Incorrect answers, please try again.");
					}
					break;
				case 203:
					result = Assessment.assessment_IT();
					if (result) {
						dbManager.setCredits(8, student1.getStudentID());
						System.out.println("Congratulations, you have successfully completed your assessment.");
					} else {
						System.out.println("Incorrect answers, please try again.");
					}
					break;
				case 204:
					result = Assessment.assessment_Python();
					if (result) {
						dbManager.setCredits(6, student1.getStudentID());
						System.out.println("Congratulations, you have successfully completed your assessment.");
					} else {
						System.out.println("Incorrect answers, please try again.");
					}
					break;
				case 404:
					System.out.println("You haven't enrolled in any course. Please enroll first.");
					break;
			}
		} catch (SQLException e) {
			System.out.println("Error fetching data: " + e.getMessage());
		}
		getStudentMenu();
	}

	// Method to get certificate after assessment
	private void getCertificate() {
		try {
			Student student1 = dbManager.getStudent(student.getStudentRoll(), student.getStudentCon());
			Course courseInfo = dbManager.getCourses(student1.getStCourseID());
			if (student1.getStCourseID() != 404) {
				if (courseInfo.getCourseCreadits() == student1.getStCreadits()) {
					System.out.println("Congratulations, you have successfully completed your course. Here is your certificate.");
				} else {
					System.out.println("Please complete the assessment first.");
				}
			} else {
				System.out.println("Please enroll in a course first.");
			}
		} catch (SQLException e) {
			System.out.println("Error fetching data: " + e.getMessage());
		}
		getStudentMenu();
	}

	// Method to exit the program
	private void studentExit() {
		System.out.println("1. Go to Login/Signup menu");
		System.out.println("2. Close the program");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		sc.nextLine();
		if (choice == 1) {
			LoginMenu lMenu = new LoginMenu(dbManager);
			lMenu.getHomeMenu();
		} else if (choice == 2) {
			LoginMenu.systemClose();
		}
	}
}

