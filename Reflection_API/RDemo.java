package Reflection_API;
import java.lang.reflect.*;

class Example {
    private void display() {
        System.out.println("Private method called");
    }
}

public class RDemo {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        Method method = Example.class.getDeclaredMethod("display");
        method.setAccessible(true);
        method.invoke(obj);
    }
}

