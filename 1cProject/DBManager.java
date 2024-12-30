import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DBManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/1cproject";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    private Connection con;
    

    // DBManager Constructor
    public DBManager(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Error while connecting to database: " + e.getMessage());
        } catch (ClassNotFoundException e2) {
            System.out.print("TError while connecting to database: " + e2.getMessage());
        }
    }

    //Method to add student to the database
    public int addStudent(Student student,int cProviderID) throws SQLException{
        PreparedStatement pStatement = null;
        try {
            pStatement = con.prepareStatement("INSERT INTO student(studentName,stRoll,stCon,cProviderID) VALUES (?, ?, ?, ?)");
            pStatement.setString(1, student.getStudentName());
            pStatement.setInt(2, student.getStudentRoll());
            pStatement.setLong(3, student.getStudentCon());
            pStatement.setInt(4, cProviderID);
            int result = pStatement.executeUpdate();
            return result;
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
        }
    }
    
    public int removeStudent(int stRoll, int cProviderID) throws SQLException {
        
    	PreparedStatement pStatement = null;
        try {
            pStatement = con.prepareStatement("DELETE FROM student WHERE stRoll = ? AND cProviderID = ?");
            pStatement.setInt(1, stRoll );
            pStatement.setInt(2, cProviderID);
            
            int result = pStatement.executeUpdate();
            return result;
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
        }
    }

    // Method to insert the CProvider Signup values into DB
    public int addCourseProvider(String name, long contact, String pass) throws SQLException {
        PreparedStatement pStatement = null;
        try {
            pStatement = con.prepareStatement("insert into cprovider(cProviderName,cProviderCon,cProviderPass) values(?,?,?)");
            pStatement.setString(1, name);
            pStatement.setLong(2, contact);
            pStatement.setString(3, passEncrypter(pass));
            int result = pStatement.executeUpdate();
            return result;
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
        }
    }
    
    //Method to check CProvider login info from DB
    public int checkCourseProvider(long contact, String pass) throws SQLException {
        PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            pStatement = con.prepareStatement("select * from cprovider where cProviderCon = ?");
            pStatement.setLong(1, contact);
            rSet = pStatement.executeQuery();
            if (rSet.next()) {
                String encPass = rSet.getString("cProviderPass");
                if (passMatch(pass, encPass)) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                return 3;
            }
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
    }

    //Method to fetch CProvider Info
    public CProvider getCProvider(long contact, String pass) throws SQLException{
        PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            pStatement = con.prepareStatement("select * from cprovider where cProviderCon = ?");
            pStatement.setLong(1, contact);
            rSet = pStatement.executeQuery();
            if (rSet.next()) {
                String encPass = rSet.getString("cProviderPass");
                if (passMatch(pass, encPass)) {
                    return new CProvider(rSet.getInt("cProviderID"), rSet.getString("cProviderName"), rSet.getLong("cProviderCon"));
                } else {
                    return null;
                }
            } else {
                return null;
            }
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }

    }
    
    public List<Student> getStudent(int cProviderID) throws SQLException{
    	PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            pStatement = con.prepareStatement("select st.*, cs.courseName "
            		+ "from student as st "
            		+ "join courses as cs "
            		+ "where cProviderID = ? and st.courseID = cs.courseID");
            pStatement.setLong(1, cProviderID);
            rSet = pStatement.executeQuery();
            List<Student> students = new ArrayList<Student>();
            
            while(rSet.next()){
            Student student = new Student(rSet.getInt("studentID"),
            		                      rSet.getString("studentName"),
            		                      rSet.getInt("stRoll"),
            		                      rSet.getLong("stCon"),
            		                      rSet.getInt("courseID"),
            		                      rSet.getString("courseName"),
            		                      rSet.getInt("stCreadits"));
            students.add(student);
            }
            return students;
            
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
    }
    
    public Student getStudent(int stRoll, long stCon) throws SQLException{
    	PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            pStatement = con.prepareStatement("select st.*,cs.courseName "
            		+ "from student as st "
            		+ "join courses as cs "
            		+ "where stRoll = ? and stCon = ? and st.courseID = cs.courseID");
            pStatement.setInt(1, stRoll);
            pStatement.setLong(2, stCon);
            rSet = pStatement.executeQuery();
            if(rSet.next()){
            	Student studentinfo = new Student(rSet.getInt("studentID"),
            		                          rSet.getString("studentName"),
            		                          rSet.getInt("stRoll"),
            		                          rSet.getLong("stCon"),
            		                          rSet.getInt("courseID"),
            		                          rSet.getString("courseName"),
            		                          rSet.getInt("stCreadits"));
            	return studentinfo;
            		                      
            }else {
            	return null;
            }
            
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
    	
    }
    
    public boolean checkStudent(int stRoll, long stCon) throws SQLException {
        PreparedStatement pStatement = null;
        ResultSet rSet = null;
        try {
            pStatement = con.prepareStatement("select * from student where stRoll = ? and stCon = ?");
            pStatement.setInt(1, stRoll);
            pStatement.setLong(2, stCon);
            rSet = pStatement.executeQuery();
            if (rSet.next()) {
                return true;
            } else {
                return false;
            }
        } finally {
            if (pStatement != null) {
                pStatement.close();
            }
            if (rSet != null) {
                rSet.close();
            }
        }
    }
    
    
    
    public List<Course> getCourses() throws SQLException {
    	PreparedStatement pStatement = null;
    	ResultSet rSet = null;
    	try {
        String query = "select * from courses where courseID != 404";
        pStatement = con.prepareStatement(query);
        rSet = pStatement.executeQuery();
        List<Course> courses = new ArrayList<Course>();
        while (rSet.next()) {
            Course course = new Course(rSet.getInt("courseID"), 
            		                   rSet.getString("courseName"),
            		                   rSet.getInt("courseCreadits"),
            		                   rSet.getInt("duration"), 
            		                   rSet.getInt("capacity"),
            		                   rSet.getInt("cFees"));
            courses.add(course);
            }
        return courses;
    } finally {
        if(pStatement!=null) {
        	pStatement.close();
        }
        if(rSet!=null) {
        	rSet.close();
        }
    }
        
    }
    
    public Course getCourses(int courseID) throws SQLException {
    	PreparedStatement pStatement = null;
    	ResultSet rSet = null;
    	try {
        pStatement = con.prepareStatement("select * from courses where courseID = ?");
        pStatement.setInt(1,courseID);
        rSet = pStatement.executeQuery();
        if(rSet.next()) {
        Course course = new Course(rSet.getInt("courseID"), 
                                   rSet.getString("courseName"),
                                   rSet.getInt("courseCreadits"),
                                   rSet.getInt("duration"), 
                                   rSet.getInt("capacity"),
                                   rSet.getInt("cFees"));
        return course;
        }else {
        	return null;
        }
        
    } finally {
        if(pStatement!=null) {
        	pStatement.close();
        }
        if(rSet!=null) {
        	rSet.close();
        }
    }
        
    }
    
    
    
    public int getEnroll(int courseID,int studentID) throws SQLException{
        PreparedStatement pStatement = null;
        try{
        	pStatement = con.prepareStatement("update student set courseID = ? where studentID = ?");
        	pStatement.setInt(1, courseID);
        	pStatement.setInt(2, studentID);
        	int result = pStatement.executeUpdate();
        	return result;
        	
        }finally{
        	if(pStatement!=null) {
            	pStatement.close();
            }
        }
    }
    
    public int setCredits(int credits,int studentID) throws SQLException{
    	PreparedStatement pStatement = null;
        try{
        	pStatement = con.prepareStatement("update student set stCreadits = ? where studentID = ?");
        	pStatement.setInt(1, credits);
        	pStatement.setInt(2, studentID);
        	int result = pStatement.executeUpdate();
        	return result;
        	
        }finally{
        	if(pStatement!=null) {
            	pStatement.close();
            }
        }
    }
    
//    public Chapters getChapters(int courseID) throws SQLException{
//    	PreparedStatement pStatement = null;
//    	ResultSet rSet = null;
//        try{
//        	pStatement = con.prepareStatement("select * from chapters where courseID = ?");
//        	pStatement.setInt(1, courseID);
//        	rSet = pStatement.executeQuery();
////            List<Chapters> chapters = new ArrayList<Chapters>();
////        	  while(rSet.next()) {
//        		Chapters chapter = new Chapters(rSet.getInt("courseID"),
//        				                        rSet.getInt("chapterID"),
//        				                        rSet.getString("chapterName"),
//        				                        rSet.getString("chapterDesc"));
////        		 chapters.add(chapter);
////        	}
//        	return chapter;
//        	
//        }finally{
//        	if(pStatement!=null) {
//            	pStatement.close();
//            }
//        	if(rSet!=null) {
//            	rSet.close();
//            }
//        }
//    }
    
    // Method to get convert password to encrypted password
    public static String passEncrypter(String pass) {
        return BCrypt.hashpw(pass, BCrypt.gensalt());
    }

    // Method to match password to encrypted password
    public static boolean passMatch(String pass, String passEncrypted) {
        return BCrypt.checkpw(pass, passEncrypted);
    }
}
