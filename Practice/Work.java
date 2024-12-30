import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the practice program digit");
        int n = sc.nextInt();
        int a = n;

        if (a == 1) {
            System.out.print("Enter the first element : ");
            int l = sc.nextInt();
            System.out.print("Enter the second element : ");
            int w = sc.nextInt();

            int result = l * w;

            System.out.println("Area of Rectangle : " + result);

        }

        if(a==2) {
            System.out.print("Enter the first element : ");
            int a1 = sc.nextInt();
            System.out.print("Enter the second element : ");
            int a2 = sc.nextInt();

            int result = a1 + a2;

            System.out.println("Sum of Two Integer : " + result);

        }

        if(a==3) {
    
              System.out.print("Enter the Element : ");
              int e = sc.nextInt();
              if(e % 2 == 0) {
               System.out.print("Even Number : ");
              }
              else{
                System.out.print("Odd Number : ");
              }
        }

        if( a== 4) {
            System.out.print("Enter the Element : ");
            int f = sc.nextInt();
            int f2 = 0;
            
        }
    }
}
