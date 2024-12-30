package Inheritance;

class A{
    public void methodA(){
     System.out.println("Method of A");
    }
}
class B extends A{
   
}
class C extends B{
        
    }
    class D extends C{
       
    }

public class Hirachical {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();

        b.methodA();
        c.methodA();
        d.methodA();
    }
    
}

