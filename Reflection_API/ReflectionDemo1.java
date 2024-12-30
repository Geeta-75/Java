package Reflection_API;

public class ReflectionDemo1 {
    public static void main(String[] args) {
        try
        {
            Class<?> classobj = Class.forName("com.Student");
            System.out.println(classobj.getName());
            System.out.println(classobj.getSimpleName());
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
