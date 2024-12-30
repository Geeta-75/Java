package Program_Set;

import java.util.Scanner;

// public class Prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Element");
//         int num = sc.nextInt();
//         int temp = 0;
//         sc.close();

//         for(int i = 2 ; i <= num - 1 ; i++){
//         if(num % i == 0)
//         {
//             temp = temp + 1;
//         }
//     }
//     if(temp == 0)
//     {
//         System.out.println(num + " is a Prime Number ");
//     }
//     else{
//         System.out.println(num + " is not Prime Number ");
//     }
// } 
// }

// using while loop 

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value ");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
        // if(c * c > n )
        // {
        // return true;
        // }
        // return false;
    }
}
