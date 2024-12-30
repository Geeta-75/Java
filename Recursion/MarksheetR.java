package Recursion;

import java.util.Scanner;

public class MarksheetR {
    static Scanner sc = new Scanner(System.in);
    static int B, Ph, En, Hi, Ch, count = 0, total;
    static Double roll, per;
    static String school = "Goverment Higher Secondary School Jiyagaon";
    static String name, fatherName, motherName, grade;
    static int maximum = 500;

    public static void main(String[] args) {
        System.out.print("Enter Your Name: ");
        name = sc.nextLine();
        System.out.print("Enter Your Father's Name: ");
        fatherName = sc.nextLine();
        System.out.print("Enter your Mother's Name :");
        motherName = sc.nextLine();
        System.out.print("Enter Your Roll No: ");
        roll = sc.nextDouble();
        Marks();
    }

    static void Marks() {
        System.out.print("Enter Your Biology Marks: ");
        B = sc.nextInt();
        System.out.print("Enter Your English Marks: ");
        En = sc.nextInt();
        System.out.print("Enter Your Chemistry Marks: ");
        Ch = sc.nextInt();
        System.out.print("Enter Your Hindi Marks: ");
        Hi = sc.nextInt();
        System.out.print("Enter Your Physics Marks: ");
        Ph = sc.nextInt();
        checkAndResult(B, En, Ch, Hi, Ph);
    }

    static void checkAndResult(int B, int En, int Ch, int Hi, int Ph) {
        int failedSubjects = check(B, En, Ch, Hi, Ph);
        if (failedSubjects <= 2) {
            if (count > 0) {
                retryExam();
            } else {
                MARKSHEET();
            }
        } else {
            Fail();
        }
    }

    static int check(int B, int En, int Ch, int Hi, int Ph) {
        int count = 0;
        if (B < 33) {
            System.out.println("Supplementary In Biology: " + B);
            count++;
        }
        if (En < 33) {
            System.out.println("Supplementary In English: " + En);
            count++;
        }
        if (Ch < 33) {
            System.out.println("Supplementary In Chemistry: " + Ch);
            count++;
        }
        if (Hi < 33) {
            System.out.println("Supplementary In Hindi: " + Hi);
            count++;
        }
        if (Ph < 33) {
            System.out.println("Supplementary In Physics: " + Ph);
            count++;
        }
        return count;
    }

    static void retryExam() {
        System.out.println("You need to retry the exams for the subjects with supplementary marks.");
        Marks();
    }

    static void Fail() {
        System.out.println("You Are Fail In Your Exam, You Have To Give Re Exam");
        System.out.println(" ");
        main(null);
    }

    static void MARKSHEET() {
        System.out.println("You Pass The Exam ");
        total = B + En + Ch + Ph + Hi;
        grade = "";
        per = (double) (total * 100) / maximum;
        if (per > 84 && per < 101) {
            grade = "A+";
        } else if (per > 74 && per < 85) {
            grade = "A";
        } else if (per > 64 && per < 75) {
            grade = "B";
        } else if (per > 54 && per < 65) {
            grade = "C";
        } else if (per > 33 && per < 55) {
            grade = "D";
        }
        Marksheet2();
    }

    static void Marksheet2() {
        System.out.println("------------------------------------------------------");
        System.out.println("|             MP BOARD BHOPAL |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|              " + school + " |");
        System.out.println("|-----------------------------------------------------|");
        System.out.println("|         Student's Name - " + name + " |");
        System.out.println("|          Father's Name - " + fatherName + " |");
        System.out.println("|          Mother's Name - " + motherName + " |");
        System.out.println("|          Roll number - " + roll + " |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|     Subject | Maximum Marks | Obtained Marks |");
        System.out.println("|       Physics | 100 | " + B + " |");
        System.out.println("|       Physics | 100 | " + En + " |");
        System.out.println("|     Chemistry | 100 | " + Ch + " |");
        System.out.println("|         Hindi | 100 | " + Hi + " |");
        System.out.println("|       English | 100 | " + Ph + " |");
        System.out.println("|------------------------------------------------|");
        System.out.println("|         Total | " + total + " |");
        System.out.println("|    Percentage | " + per + " |");
        System.out.println("|         Grade | " + grade + " |");
        System.out.println("----------------------------------------------------");
    }
}
