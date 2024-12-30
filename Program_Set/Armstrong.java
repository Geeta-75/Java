package Program_Set;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int num2 = num ;
        int total = 0 , temp ;

        while ( num2 != 0)
        {
            temp = num2 % 10;
            total = total + temp * temp * temp ;
            num2 = num2 / 10;
        }
        if (total == num)
          System.out.println(num + " is an Armstrong Number");
          else 
            System.out.println(num + " is not  an Armstrong Number");

    }
}

// public class Armstrong {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 500; i++) {
//             if (isArmstrong(i)) {
//                 System.out.println(i);
//             }
//         }
//     }

//     static boolean isArmstrong(int n) {
//         int original = n;
//         int sum = 0;
//         while (n > 0) {
//             int rem = n % 10;
//             n = n / 10;
//             sum = sum + rem * rem * rem;
//         }
//         return sum == original;
//     }
// }

// public class Armstrong {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Number");
// int n = sc.nextInt();
// int n2 = n;
// int rem , rev = 0 , count = 0 ;

// while (n != 0)
// {
// count++;
// n = n/10;
// }
// int arm = 0;
// for(int i = 1 ; n2 != 0 ; i++)
// {
// rem = n2 % 10 ;
// int multi = 1;
// for(int j = 1 ; j <= count ; j++)
// {
// multi = multi * rem;
// }
// arm = arm + multi ;
// n2 = n2 / 10;
// }
// System.out.println("Armstrong Number : " + arm);

// }

// }
