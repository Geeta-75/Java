package Pattern;

import java.util.Scanner;
public class Star3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int num = sc.nextInt();
        for(int i =1 ; i <= num ; i ++)
        {
            for(int j = num ; j >= i ; j--)
            {
                System.out.print("   ");
            }
            for(int k = 1 ; k<=i ; k++)
            {
                 System.out.print(" * ");
            }
             System.out.println();
        }
       
    }
}

// public class Star3 {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int num = sc.nextInt();
//         for(int i = 1 ; i<=num ; i++)
//         {
//             for(int j = 1 ; j<=i ; j ++)
//             {
//                 System.out.println("");
//             }
//                 for(int k = i ; k >= i ; k--)
//                 {
//                     System.out.println("*");
//                 }
//                 for (int l = 1 ; l <= num ; l++)
//                 {
//                    if (l%2 == 0 )
//                    {
//                     System.out.println(" ");
//                    }
//                    else {
//                     System.out.println("*");
//                    }
//                 }
//             }
//         }
//     }
    

