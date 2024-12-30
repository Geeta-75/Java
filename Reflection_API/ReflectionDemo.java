package Reflection_API;
import java.lang.reflect.*;
public class ReflectionDemo {
    public static void main(String[] args) {
        Student student = new Student("Riya" , 18);

        Class<? extends Student > studentClass = student.getClass();

        Method[] methodArray = studentClass.getMethods();

        for (Method method : methodArray) {
            System.out.println(method.getName());
        }
        System.out.println("----------------------------------");

        Field[] fieldArray = studentClass.getDeclaredFields();

        for ( Field field : fieldArray )
        {
            System.out.println(field.getName());
        }
    }
    
}
