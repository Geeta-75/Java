import java.util.Scanner;

public class factorialNum {
    public static void main(String[] args) {
        
        factorialNum.s();
    }

    static void s()
    {
      int n, i , fact = 1;

        System.out.println("Enter the Number");
        Scanner s = new Scanner (System.in);
        n = s.nextInt();
        for (i = 1; i <= n ; i ++)
{
    fact = fact*i;
} 

System.out.println("Factorial of   " + n + "  is  "  + fact);

}  
    }
    


    // FactorialNumber 

    /*public class factorialNum {

    public static void printfactorial (int n) {

        if (n<0)
        {
            System.out.println("Invalid Number");
        }
        int factorial = 1;
        // loop 
        for (int i=n;i>=1;i--)
        {
            factorial = factorial * i;
        }
            System.out.println(factorial);
        }

        public static void main(String [] args)
        {
            Scanner sc = new Scanner (System.in);
             
                int n = sc.nextInt();
                printfactorial(n);
            

        }
    }*/


    /*public class factorialNum {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        factorialNum obj = new factorialNum();

        int n = sc.nextInt();
        obj.factorial (n);
    }

     void factorial (int n)
    {
    
int  fact = 1;
for (int i = 1; i <=  n ; i ++)
{
    fact = fact*i;
 

//System.out.println("Factorial of   " + n + "  is  "  + fact);

System.out.println("Factorial" + fact);

}  
    }

    }*/