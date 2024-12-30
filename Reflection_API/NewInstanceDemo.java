package Reflection_API;
class Example {
    public void show() {
        System.out.println("New instance created");
    }
}

public class NewInstanceDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Example");
        Example obj = (Example) clazz.newInstance();
        obj.show();
    }
}


