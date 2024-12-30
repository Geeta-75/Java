
public class Course {
    int courseID;
    String courseName;
    int courseCreadits;
	int duration;
    int capacity;
    int cFees;
    
	//Constructor
    public Course(int courseID,String courseName,int courseCreadits,int duration,int capacity,int cFees) {
    	this.courseID = courseID;
    	this.courseName = courseName;
    	this.courseCreadits = courseCreadits;
    	this.duration = duration;
    	this.capacity = capacity;
    	this.cFees=cFees;
    }

    
	public int getCourseID() {
		return courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getCourseCreadits() {
		return courseCreadits;
	}
	
	public int getDuration() {
		return duration;
	}


	public int getCapacity() {
		return capacity;
	}
	

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
    public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getCFees() {
		return cFees;
	}
    
    
}
