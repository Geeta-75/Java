package Encapsulation;

public class Name {
    private String Name ;
    public void setName(String name)
    {
       Name = name ;
    }
    public String getName()
    {
        return Name;
    }
    public static void main(String[] args) {
        Name n = new Name();
        n.setName("Riya Rajput");
        System.out.println(n.getName());
    }
    
}
