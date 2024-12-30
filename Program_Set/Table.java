package Program_Set;

import java.util.Scanner;

// public class Table {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number :  ");
//         int num = sc.nextInt();
//         sc.close();
//         for(int i = 1 ; i<=10 ; i++)
//         {
//             System.out.println(num*i);
//         }
//     }
    
// }

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :  ");
        int num = sc.nextInt();
        sc.close();
        for(int i = 1 ; i<=num ; i++)
        {
           for(int j = 1 ; j<= 10 ; j++)
        
        {
            //System.out.println(i*j);
            System.out.println(i  + " * " + j + " = " + i * j);
        }
        System.out.println("-------------------");
    }
}
}
