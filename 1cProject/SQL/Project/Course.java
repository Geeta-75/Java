package Project;

public class Course {
    // Class variables (also called fields) to store information about the course
    int courseID;          // This stores the ID of the course
    String courseName;     // This stores the name of the course
    int courseCredits;     // This stores how many credits the course is worth
    int duration;          // This stores the duration of the course in months
    int capacity;          // This stores how many students can enroll in the course
    int cFees;             // This stores the fees for the course
    
    // Constructor to initialize the Course object with values when we create it
    public Course(int courseID, String courseName, int courseCredits, int duration, int capacity, int cFees) {
        this.courseID = courseID;          // Set the course ID
        this.courseName = courseName;      // Set the course name
        this.courseCredits = courseCredits;// Set the course credits
        this.duration = duration;          // Set the duration
        this.capacity = capacity;          // Set the capacity
        this.cFees = cFees;                // Set the course fees
    }

    // Getters: Methods to retrieve (get) the values of the fields
    public int getCourseID() {
        return courseID;   // Return the course ID
    }

    public String getCourseName() {
        return courseName; // Return the course name
    }

    public int getCourseCredits() {
        return courseCredits; // Return the course credits
    }

    public int getDuration() {
        return duration; // Return the duration of the course
    }

    public int getCapacity() {
        return capacity; // Return the capacity of the course
    }

    public int getCFees() {
        return cFees; // Return the course fees
    }

    // Setters: Methods to change (set) the values of the fields
    public void setCourseID(int courseID) {
        this.courseID = courseID; // Change the course ID
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName; // Change the course name
    }

    public void setDuration(int duration) {
        this.duration = duration; // Change the duration of the course
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity; // Change the capacity of the course
    }
}
