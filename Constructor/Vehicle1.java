package Constructor;

import java.util.Scanner;

public class Vehicle1 {
    static String type;
    static String colour;
    static int year;

    Vehicle1(int choice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car ");
        int a = sc.nextInt();
        System.out.println("1 Jeep");
        System.out.println("2 Aldo");

        if (a == 1) {
            System.out.println("Jeep");
        } else if (a == 2) {
            System.out.println("Aldo");
        } else {
            System.out.println("Invalid");
        }
    }

    void Car() {
        this.type = type;
        this.colour = colour;
        this.year = year;

        System.out.println(colour);
        System.out.println(year);

    }

    Vehicle1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bike ");
        int b = sc.nextInt();
        System.out.println("1 Shine");
        System.out.println("2 pulsur");

        if (b == 1) {

            // System.out.println("Shine");
        } else if (b == 2) {
            System.out.println("pulsur");
        } else {
            System.out.println("Invalid");
        }
    }

    void Bike() {
        this.type = type;
        this.colour = colour;
        this.year = year;

        System.out.println(colour);
        System.out.println(year);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 Car");
        System.out.println("2 Bike");
        System.out.println("Enter the vehicle  you want to");
        int a = sc.nextInt();
        Vehicle1 obj = new Vehicle1();
        Vehicle1 obj2 = new Vehicle1();

        if (a == 1) {
            System.out.println("Car");

            obj.Car();
        } else if (a == 2) {
            System.out.println("Bike");
            obj2.Bike();
        } else {
            System.out.println("Invalid");
        }

    }
}
