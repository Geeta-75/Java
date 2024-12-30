package Program_Set;

import java.util.Scanner;

public class Percentage {
    static int maximum = 500;
    static double Percentage;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Hindi Marks");
        int Hi = sc.nextInt();
        System.out.println("Enter your English Marks ");
        int En = sc.nextInt();
         System.out.println("Enter your Biology Marks");
        int Bio = sc.nextInt();
        System.out.println("Enter your Chemistry Marks ");
        int Ch = sc.nextInt();
         System.out.println("Enter your Physics Marks");
        int Ph = sc.nextInt();
        sc.close();

    
        int total = Hi + En + Bio + Ch + Ph ;
       Percentage =   ((double) (total * 100) / maximum);

        System.out.println("Percentage of Five Subjects : " + Percentage);
        
    }
}
