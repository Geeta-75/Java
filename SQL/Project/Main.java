package Project;

public class Main {
    public static void main(String[] args) {
        CourseProvider provider = new CourseProvider();
         provider.addCourse();

        Student student = new Student();
        student.enrollCourse(); 
        ProgressTracker tracker = new ProgressTracker();
        tracker.updateProgress(1, 50); // Progress ko 50% karega
        tracker.updateProgress(1, 100); // 100% complete karne par certificate issue karega
    }
}