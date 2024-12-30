package Recursion;

import java.util.Scanner;

public class Factorial_With_Sum {
   static void Factorial(int fact , int n , int num)
    {
        if(num == 0)
        {
          System.out.println(fact);
         return ;
        }
           int sum = 0;
          for(int j = 1 ; j <= num  ; j++)
          {
              sum = sum + fact;
          }
               fact = sum;
           Factorial( fact ,n , num - 1);
         
      }

      public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Number");
    int n = sc.nextInt();
    int fact = n;
    int num = fact-1;
    Factorial(fact , n -1 , num);
        

    }
            
        }


/*public class Factorial_With_Sum
{
 static int fact ;
  public static int Factorial(int n )
  {
   int fact = n;
    if(n == 1)
    return 1;
    int sum = 0;
    for(int j = 1 ; j <= n + 19 ; j++)
    {
        sum = sum + fact ;
    }
    fact = sum;
System.out.println("Factorial " + n + " is " + fact);
return sum;
}
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Element ");
    // int n = sc.nextInt();

    int n = 5;

    System.out.print(Factorial(n));
  }
}*/
        
    
    

