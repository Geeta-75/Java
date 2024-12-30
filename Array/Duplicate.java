package Array;

// import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
       
        int a [] = {1,2,2,3,3,4,5,6,6,7};
        System.out.println(" Duplicate Value  ");
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = i+1 ; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println(a[j] );
                }
            }
        }  
}  
}


// public class Duplicate{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.print("Enter the Array Size :  ");
//         int n = sc.nextInt();
//         int [] a = new int[n];
//         System.out.println("Enter the all elements");
//         for(int i = 0 ; i < n ; i++)
//         {
//             a[i] = sc.nextInt();
//         }
//         System.out.println("Duplicate Value ");
//         for(int i = 0 ; i <= n ; i++)
//         {
//             for(int j = i + 1; j < n ; j++)
//             {
//                 if(a[i] == a[j])
//                 {
//                     System.out.println(a[i]);
//                 }
//             }
//         }
//     }
// }