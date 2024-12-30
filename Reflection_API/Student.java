package Reflection_API;

public class Student {

    private String name;
    private int age;

    public Student(String string, int age) {
        //TODO Auto-generated constructor stub
        super();
        this.name = name ;
        this.age =age;
    }

    public String getName()
    {
        return name;
    }

    public void setname (String namr) 
    {
        this.name = name;
    }
    
    public int getage() 
    {
        return age;
    }

    public void setAge (int age) 
    {
        this.age = age;
    }
}
