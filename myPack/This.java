package myPack;
// this: to invoke current class method
public class This {
    
    void name (){
        String name = "Riya Rajput ";
        System.out.println("Name : " + name );
    }
     void Address(){
       // this.name();
       name();
        System.out.println(" Dewas ");
    }
    public static void main(String[] args) {
        This t = new This();
        t.Address();
    }
    
}

// this() : to invoke current class constructor
class A{
    
}


// Calling parameterized constructor from default constructor:
