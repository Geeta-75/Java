package Abstraction;

public abstract class InnerAnnon {
    
    abstract void Start();

}

class Car extends Inner_Annonymous {
    void Start() {
        // System.out.println(" Car Starts with Key");
    }

    public static void main(String[] args) {
        Car c = new Car() {
            void Start() {
                System.out.println(" Car Starts with Key");
            }
        };
        c.Start();
    }
}


