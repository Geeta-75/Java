package Encapsulation;

public class CofeeMachine {
    private boolean powerOn;

    public CofeeMachine() {
        this.powerOn = false;
    }

    public void turnOn() {
        powerOn = true;
        System.out.println("Cofee Machine is now on. ");
    }

    private void grindCofeeBeans() {
        System.out.println("Grinding Cofee Beans....");
    }

    private void heatWater() {
        System.out.println("Heating Water....");
    }

    private void dispenceCofee() {
        System.out.println("Dispensing cofee. Enjoy! ");
    }

    public void makeCofee() {
        if (powerOn) {
            grindCofeeBeans();
            heatWater();
            dispenceCofee();
        } else {
            System.out.println("Please turn on the cofee machine first.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        CofeeMachine myCofeeMachine = new CofeeMachine();
        myCofeeMachine.turnOn();
        myCofeeMachine.makeCofee();
    }

}
