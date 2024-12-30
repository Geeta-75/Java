package Reflection_API;

public class Reflectiondemo2 {
    public static void main(String[] args) {
        Student student = new Student("Riya" , 18);

        Class<? extends Student> classobj = student.getClass();
        System.out.println(classobj.getName());
    }
}
