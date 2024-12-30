package myPack;


import java.text.DecimalFormat;
import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student's Name ");
        String name = sc.nextLine();
        System.out.println("Enter the Student's ID : ");
        int ID = sc.nextInt();

        Integer totalPoints = 0;
        Integer totalCredits = 0;

        boolean moreClasses;

        do {
            Integer credits = 0;
            boolean validCredits = true;
            do {

                validCredits = true;

                System.out.println("Enter the Number of credits : ");
                String Credits = sc.nextLine();
                try {
                    credits = Integer.parseInt(Credits);
                } catch (NumberFormatException nfe) {
                    System.out.println("Please ! Enter a valid number ");
                    validCredits = false;
                }
            } while (!validCredits);

            boolean validGrade = true;

            Integer gradeValue = 0;
            String grade = "";

            do {

                System.out.println("Enter Grade");
                grade = sc.nextLine();
                if (grade.equals("A")) {
                    gradeValue = 4;
                } else if (grade.equals("B")) {
                    gradeValue = 3;
                } else if (grade.equals("C")) {
                    gradeValue = 2;
                } else if (grade.equals("D")) {
                    gradeValue = 1;
                } else if (grade.equals("F")) {
                    gradeValue = 0;
                } else {
                    System.out.println("You didn't have enter a valid grade :(");
                    validGrade = false;
                }
            } while (!validGrade);
            Integer points = gradeValue * credits;

            totalPoints = totalPoints + points;
            totalCredits += credits;

            System.out.println("Would you like to another Class ? (Yes / No)");
            String MoreClasses = sc.nextLine();

            moreClasses = MoreClasses.equals("Yes");
        } while (moreClasses);

        DecimalFormat df = new DecimalFormat("0.00");
        Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);

        System.out.println("Student ID : " + ID);
        System.out.println("Student's Name : " + name);
        System.out.println("Credits : " + totalCredits);
        System.out.println("Points : " + totalPoints);
        System.out.println("GPA: " + df.format(gpa));
        sc.close();
    }

}

