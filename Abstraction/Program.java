package Abstraction;

// By using Multiple Inheritance 
interface Program {
    abstract void show();
}

interface Program2 {
    void display();
}

class Test implements Program, Program2 {
    public void show() {
        System.out.println("Hey !");
    }

    public void display() {
        System.out.println("Riya");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}
