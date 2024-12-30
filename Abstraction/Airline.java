package Abstraction;

import java.util.Scanner;

interface Airline {
    abstract void booking();

    abstract void Selecting_seat();

    abstract void cheking_in();

}

class Passenger {
    public void booking() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose booked : Yes ya No");
        String ch = sc.nextLine();
        if (ch.equals("Yes")) {
            System.out.println("Choose : 1. Antonov || 2. Airbus A380 || 3. Cessna 122");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Suceessfull Booked Antonov .. Thankyou ");
                System.out.println("The Antonov An-225 Mriya was a strategic airlift cargo aircraft designed");
                System.out.println("Produced by : the Antonov Design Bureau in the Soviet Union");
            }
            if (n == 2) {
                System.out.println("Suceessfull Booked Airbus A380 .. Thankyou ");
                System.out.println(
                        "As the world's largest and most spacious passenger aircraft, flying with Airbus' wide-body A380");
            } else if (n == 3) {
                System.out.println("Suceessfull Booked Cessna 122 .. Thankyou ");
                System.out.println("Cessna Citation jets, Caravan turboprops and classic pistons dominate the sky.");
            }
        } else if (ch.equals("No")) {
            System.out.println("Thankyou for Information !");
        }
    }

    public void Selecting_seat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select seat : 1. First seat , 2. Middle seat , 3. Last seat ");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println(" Successfull first seat");
        } else if (ch == 2) {
            System.out.println(" Successfull  middle seat");
        } else if (ch == 3) {
            System.out.println(" Successfull  last seat ");
        }

    }

    public void cheking_in() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check In : 1.Yes 2. No");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println(" Booked Successfull ! Done ");
        } else if (ch == 2) {
            System.out.println("Thankyou ! no success.. booked ");
        }
    }

    static void Choose() {
        Passenger p = new Passenger();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose it  : 1. booked flight , 2. selecting Seat , 3. checking process ");
        int ch = sc.nextInt();
        if (ch == 1) {
            p.booking();
            Continue();
        } else if (ch == 2) {
            p.Selecting_seat();
            Continue();
        } else if (ch == 3) {
            p.cheking_in();
            Continue();
        }
    }

    static void Continue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Continue Process : 1. Yes 2. No");
        int c = sc.nextInt();
        if (c == 1) {
            Choose();
        } else {
            System.out.println("okay! ThankYou...");
        }
    }

    public static void main(String[] args) {
        Choose();
    }

}
