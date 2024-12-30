package Reflection_API;

import java.lang.reflect.Method;

class Example {
    private void privateMethod() {
        System.out.println("Private method accessed");
    }
}

public class RDemo2  {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        Method method = Example.class.getDeclaredMethod("privateMethod");
        method.setAccessible(true);
        method.invoke(obj);
    }
}


