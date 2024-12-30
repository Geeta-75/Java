package Reflection_API ;
import java.lang.reflect.Method;

public class Lion {
    public static void main(String[] args) throws Exception {
        String str = "methodA";
        //Retreive the method - getMethod()
         Method m = Lion.class.getMethod(str);
        //Call the method 
        m.invoke(m);
    }
    public static void methodA() {
        System.out.println("Inside methodA");
    }
    public static void methodB() {
        System.out.println("Inside methodB");
    }
}
