package Program_Set;

import java.util.Scanner;

public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
    
//}


public static void main(String[] args) 
    {


        
        
        int num;

           Scanner sc = new Scanner (System.in);
           System.out.println("Enter the number");
           num = sc.nextInt();
           sc.close();

          

           int square = num*num;

           System.out.println("Square  of  " + num + "  is  " + square);

           int a = 0 , b = 1 , c;
            
           System.out.println("Fabonacci Series");
                for (int i = 0 ; i < num ; i++)
                {
                   c = a+b;
                   System.out.println( a);
                   a = b;
                   b = c; 
                }

                 System.out.println("Factorial Number");
           {
            int fact = 1;
           for (int i = 1; i <= num; i ++)
           {
               fact = fact*i;
           } 
           
           System.out.println(num + " of " + fact);
        }
        System.out.println("Prime Number");
        for (int i = 2 ; i < num  ; i ++)
        {
          if(num %i ==0){  
            
          System.out.println(num + "Prime");  
                
         }  
         System.out.println(num + "Not Prime");    
        }

       System.out.println("EvenOdd Number");
          if(num %2 ==0){  
            
          System.out.println(num + "Even");
         }    
         else{
            System.out.println(num + "Odd");
         }  
       
    }
        
    }
                
    



