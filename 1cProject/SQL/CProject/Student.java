package CProject;

public class Student {
    private int stID;
    private String stName;
    private int stRoll;
    private long stContact;
    private String stCourse;
    private int stCourseID;
    private int stCreadits;

    
	
	public Student(int stID,String stName,int stRoll, long stContact,int stCourseID,String stCourse,int stCreadits) {
    	this.stID = stID;
        this.stName = stName;
        this.stRoll = stRoll;
        this.stContact = stContact;
        this.stCourseID = stCourseID;
        this.stCourse = stCourse;
        this.stCreadits = stCreadits;
       
    }
    // Student class constructor
    public Student(String stName,int stRoll, long stContact) {
        this.stName = stName;
        this.stRoll = stRoll;
        this.stContact = stContact;
    }
    
    public Student(int studentID,String stName, int stRoll, long stContact,String stCourse) {
        this.stID = studentID;
    	this.stName = stName;
        this.stRoll = stRoll;
        this.stContact = stContact;
        this.stCourse =stCourse;
    }
    public int getStudentID() {
        return stID;
    }

    public String getStudentName() {
        return stName;
    }

    public int getStudentRoll() {
        return stRoll;
    }

    public long getStudentCon() {
        return stContact;
    }
    
    public String getStudentCourse() {
        return stCourse;
    }
    public int getStCourseID() {
		return stCourseID;
	}
    
    public int getStCreadits() {
		return stCreadits;
	}

}