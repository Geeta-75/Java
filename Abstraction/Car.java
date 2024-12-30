package Abstraction;

import java.util.Scanner;

interface car1 {
    abstract void steering_wheel();
}

interface car2 {
    void pedals();
}

interface car3 {
    abstract void deshboard();
}

class Car implements car1, car2, car3 {
    public void steering_wheel() {
        System.out.println("Work :  wheel which the driver holds when he or she is driving.");
    }

    public void pedals() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose it : 1. Left pedal || 2. middle pedal ||3. Right pedal");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Left Pedal : the Clutch pedal, that makes the car go.");
        } else if (n == 2) {
            System.out.println("Middle Pedal :  the Brake pedal, slows all four wheels at the same time.  ");
        } else if (n == 3) {
            System.out.println(
                    "Right Pedal :  the Gas pedal, the more you push it down the more it increases the fuel flow into the engine and the faster you go. ");
        }

    }

    public void deshboard() {
        System.out.println("a control panel set within the central console of a vehicle or small aircraft.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Choose it : 1. steering wheels , 2. pedals , 3 . deshboard");
        int ch = sc.nextInt();
        if (ch == 1) {
            c.steering_wheel();
        } else if (ch == 2) {
            c.pedals();
        } else if (ch == 3) {
            c.deshboard();
        } else {
            System.out.println("Not Available");
        }
    }

}
