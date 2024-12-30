package Program_Set;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element ");
        int n = sc.nextInt();
        System.out.println("Reverse Number : ");
        sc.close();
       for(int i = n ; i >= 1 ; i--) 
        {
            System.out.println(i);
        }
    }
    
}

                   // Reverse a Number Using a while loop in java

//    public class Reverse{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter the Element ");
//         int num = sc.nextInt();
//         sc.close();
//         //int num = 1234;
//         int reversed = 0 ;
//         System.out.println("Number : " + num);
//         while (num != 0)
//         {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit ;
//             num = num / 10;
//         }
//         System.out.println("Reversed Number : " + reversed);

        
        
//     }
//    }                