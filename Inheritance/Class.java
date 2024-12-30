package Inheritance;

    class A {
        public void methodA() {
            System.out.println("Base Class Method ");
        }
    
    }
    
    class B extends A {
        public void methodB() {
            System.out.println("Child class Method ");
        }
    }
    
    public class Class {
        public static void main(String[] args) {
            B obj = new B();
            obj.methodA();
            obj.methodB();
        }
    
    }
      

