package myPack;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        int bonus = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sallery of company ");
        int Sallery = sc.nextInt();
        System.out.println("Enter your this company work year");
        int year = sc.nextInt(); 
        
        int total_bonus = bonus + Sallery;

        if(year >= 5)
        {
            System.out.println("Sallery : " + Sallery);
           System.out.println("Worked Year : " + year);
           System.out.println("total Sallery : " + total_bonus);
           
        }
        else{
            System.out.println("You are not eligible this policy");
        }

    }
    
}
