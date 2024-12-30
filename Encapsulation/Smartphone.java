package Encapsulation;

 import java.util.Scanner;

public class Smartphone {
    private String brand;
    private int memorySizeGB;

    public Smartphone(String brand, int memorySizeGB) {
        this.brand = brand;
        this.memorySizeGB = memorySizeGB;
    }

    public String getBrand() {
        return brand;
    }

    public int setmemorySizeGB() { // public void setmemorySizeGB(){
        return memorySizeGB; // this.memorySizeGB = memorySizeGB; }
    }

    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Memory Size : " + memorySizeGB);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the brand name : ");
        // String str = sc.nextLine();
        // System.out.print("Enter the MemorySize : ");
        // int n = sc.nextInt();
        //Smartphone myPhone = new Smartphone(str, n);
        Smartphone myPhone = new Smartphone("Samsung", 128);
        myPhone.getBrand();
        myPhone.setmemorySizeGB();
        myPhone.displayDetails();
    }

}
