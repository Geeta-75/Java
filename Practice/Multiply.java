import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number ");
        int a = sc.nextInt();
        System.out.println("Enter your second number ");
        int b = sc.nextInt();
        int Multi = a*b;
        System.out.println("Multiply = " + Multi);
    }
}
