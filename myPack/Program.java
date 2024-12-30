package myPack;

import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
      Program();
   }

   static void Program() {
      Scanner sc = new Scanner(System.in);
      System.out.println("choose 1 for Fabonacci Series ");
      System.out.println("----------------------------");
      System.out.println("choose 2 for Factorial Number ");
      System.out.println("----------------------------");
      System.out.println("choose 3 for Prime Number ");
      System.out.println("----------------------------");
      System.out.println("choose 4 for Palindrome Number ");
      System.out.println("----------------------------");
      System.out.println("choose 5 for Reverse Number ");
      System.out.println("----------------------------");
      System.out.println("choose 6 for Armstrong Number ");
      System.out.println("----------------------------");
      System.out.println("choose 7 for Factor  ");
      System.out.println("----------------------------");
      System.out.println("choose 8 for Leap Year ");
      System.out.println("----------------------------");
      System.out.println("choose 9 for Percentage ");
      System.out.println("----------------------------");
      System.out.println("choose 10 for Anagram Number ");
      System.out.println("----------------------------");
      System.out.println("choose 11 for Duplicate Value  ");
      System.out.println("----------------------------");
      System.out.println("choose 12 for Remove Duplicate ");
      System.out.println("----------------------------");
      System.out.println("choose 13 for Duplicate String  ");
      System.out.println("----------------------------");
      System.out.println("choose 14 for Second_Repeated Char ");
      System.out.println("----------------------------");
      int Program = sc.nextInt();
      switch (Program) {
         case 1:
            System.out.print("Enter the Value : ");
            int n = sc.nextInt();
            int a = 0, b = 1, c;
            System.out.println("Fabonacci Series ");
            for (int i = 1; i <= n; i++) {
               c = a + b;
               System.out.println(a);
               a = b;
               b = c;
            }
            break;

         case 2:
            System.out.print("Enter the Value : ");
            int num = sc.nextInt();
            int fact = 1;
            for (int i = 1; i <= num; i++) {
               fact = fact * i;
            }
            System.out.println("Factorial  " + num + " is " + fact);
            break;

         case 3:
            System.out.print("Enter the Value : ");
            int n1 = sc.nextInt();
            int n2 = 0;
            for (int i = 2; i <= n1 - 1; i++) {
               if (n1 % i == 0) {
                  n2 = n2 + 1;
               }
            }
            if (n2 == 0) {
               System.out.println("It's a Prime ");
            } else {
               System.out.println("It's not Prime");
            }
            break;

         case 4:
            System.out.print("Enter the Value : ");
            int no = sc.nextInt();
            int temp = no;
            int rev = 0, rem;
            while (temp != 0) {
               rem = temp % 10;
               rev = rev * 10 + rem;
               temp = temp / 10;
            }
            if (no == rev) {
               System.out.println(" It's Palindrome Number ");
            } else {
               System.out.println("It's not Palindrome");
            }
            break;

         case 5:
            System.out.print("Enter the Value : ");
            int r = sc.nextInt();
            System.out.println("Reverse Number");
            for (int i = r; i >= 1; i--) {
               System.out.println(i);
            }
            break;

         case 6:
            System.out.print("Enter the Value : ");
            int A = sc.nextInt();
            int a2 = A;
            int sum = 0, te;
            while (a2 != 0) {
               te = a2 % 10;
               sum = sum + te * te * te;
               a2 = a2 / 10;
            }
            if (sum == A) {
               System.out.println("it's a Armstrong");
            } else {
               System.out.println("It's not Armstrong ");
            }
            break;

         case 7:
            System.out.print("Enter the Value :  ");
            int number = sc.nextInt();
            int count = 0;
            System.out.println("Factor of Number ");
            for (int i = number; i >= 1; i--) {
               if (number % i == 0) {
                  System.out.println(i);
                  count++;
               }
            }
            System.out.println("All Elements Count :  " + count);
            break;

         case 8:
            System.out.print("Enter the Leap Year :  ");
            int year = sc.nextInt();
            if ((year % 4 == 0) && (year % 400 == 0 || year != 0)) {
               System.out.println(" It's a Leap Year - " + year);
            } else {
               System.out.println("It's not leap year");
            }
            break;

         case 9:
            int maximum = 500;
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

            int total = Hi + En + Bio + Ch + Ph;
            double Percentage = ((double) (total * 100) / maximum);

            System.out.println("Percentage of Five Subjects : " + Percentage);
            break;

         case 10:
            System.out.print("Enter the Value : ");
            int A2 = sc.nextInt();
            int Count = 0;
            for (int i = 1; i <= A2; i++) {
               for (int j = 1; j <= A2; j++) {
                  for (int k = 1; k <= A2; k++) {
                     if (i != k && i != j && j != k) {
                        System.out.println(i + " " + j + " " + k);
                        Count++;
                     }
                  }
               }
               System.out.println("---------------------------------");
            }
            System.out.println("Total Element : " + Count);
            break;

         case 11:
            int[] arr = { 1, 2, 3, 3, 4, 5, 5, 6, 7 };
            System.out.println("Duplicate Value");
            for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                  if (arr[i] == arr[j]) {
                     System.out.println(arr[j]);
                  }
               }

            }

            break;

         case 12:
            int d = 0;
            int arr2[] = { 2, 2, 4, 4, 6, 6, 8, 8, 10, 10 };
            System.out.println("Remove Duplicate");
            for (int i = 0; i < arr2.length; i++) {
               for (int j = i + 1; j < arr2.length; j++) {
                  if (arr2[i] == arr2[j]) {
                     arr2[i] = d;
                  }
               }
            }
            for (int k = 0; k < arr2.length; k++) {
               if (arr2[k] != d) {
                  System.out.println(arr2[k]);
               }
            }

            break;

         case 13:
         String a6 = "Geeta";
         int count1;
         char[] str = a6.toCharArray();
         System.out.println("Duplicate characters in a given string: ");
         for (int i = 0; i < str.length; i++) {
             count1 = 1;
             for (int j = i + 1; j < str.length; j++) {
                 if (str[i] == str[j] && str[i] != ' ') {
                     count1++;
                     str[j] = '0';
                 }
             }
             if (count1 > 1 && str[i] != '0')
                 System.out.println(str[i]);
         }
            break;

            case 14:
           String st = "Geeta";
            int count2 = 0;
            for(int i = 0 ; i< st.length() ; i++){
               for(int j = i + 1; j < st.length() ; j++){
                  if(st.charAt(i) == st.charAt(j)){
                     count2++;
                  }
               }
               if(count2 == 0){
                  System.out.println(st.charAt(i));
                  break;
               }
               count = 0;
            }
            break;

         default:
            System.out.println(" Not Found ..!! ");
            break;

      }
   }

   public static void String() {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the name");
      String s = sc.nextLine();
      System.out.println("Enter the Value");
      int a = sc.nextInt();
      System.out.println("Enter the Number");
      double d = sc.nextDouble();

      System.out.println("String: " + s);
      System.out.println("Double: " + d);
      System.out.println("Int: " + a);

   }
}
