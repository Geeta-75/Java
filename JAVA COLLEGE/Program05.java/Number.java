import java.util.Scanner;

/*public class Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter the First Number");
        int a = sc.nextInt();
    
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        sc.close();

        
    
        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a/b;
        int module = a % b;
        if(a > b)
        {
          System.out.println(" Number is a Large Number " );
           
        }
    else
         { 
        System.out.println(" Number is  not a Large  ");
         }
    
        System.out.println("Sum the two Integer are  =" + sum);

        System.out.println("Sub the two Integer are  =" + sub);

        System.out.println("Multiplt the two Integer are  =" + multiply);

        System.out.println("Divide the two Integer are  =" + divide);
        
        System.out.println("Module the two Integer are  =" + module);
    }
    
}*/


// Merge Program [ Square , Fabonacci Series , Factorial Number]

public class Number
{
    
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
           
           System.out.println( fact);
        }
        System.out.println("Prime Number");
        for (int i = 2 ; i < num  ; i ++)
        {
          if(num %i ==0){  
            
          System.out.println("Prime");  
                
         }  
         System.out.println("Not Prime");    
        }

       System.out.println("Even Number");
          if(num %2 ==0){  
            
          System.out.println("Even");
         }    
         else{
            System.out.println("Odd");
         }  
       
    }
        
    }
                
    


