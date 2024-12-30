// Program : Factorial Number

/*public class itself {
    public static void main(String[] args) {
        int num = 5 , result ;
        result = factoral (num);
        System.out.println(num + "  factorial =  " + result);
    }

     static int factoral (int n)
    {
        if (n > 0)              // termination Condition
        
            return n * factoral (n - 1);     // recursive Call
        
        else 
        
            return 1;
        
    }
    
}*/

// Even Number

public class itself {
    public static void main(String[] args) {
        int num = 2 , result;
        result = even (num);
    }
    
    static int even (int num)
    {
        
        if (num % 2 == 0)
        
            return num;

            else 

            System.out.println(num);
            return even(num);
        
    }
}


// Program : Print fact n  Natural Number 

/*public class itself 
{
    public static void main(String[] args) {
       itself r = new itself();
       int a = r.sum(3);
       System.out.println("Sum first N Natural Number "  + a);
    }
    int sum (int b)
    {
        if (b > 0)
        {
            return b +sum (b - 1);
        }
        else 
        {
            return 0;
        }
    }
}*/

// Program : Print fact n  Fabonacci Series

// import java.util.Scanner;

// public class itself 
// {
    
//     static void Fab(int a , int b,int n)
//     {

//         if (0<=n)
//         {
//           int c = a + b;
//           System.out.println(a);
//           a = b ;
//           b = c ;
//         }
//     }
//      public static void main(String[] args) {
//      Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the Number ");
//         int n = sc.nextInt(0);
//         int a = 0 , b = 1 ;
    
//         Fab(a,b,n);
//     }
// }


// Reverse Number 

// public class itself 
// {
//     public static void main(String[] args) {
//         int n = 5;
//        Reverse(n);     
//     }
//     public static void Reverse (int n)
//     {
//         if (n == 0)
//         {
//             return;
//         }
//         System.out.println(n);
//         Reverse  (n -  1);
//     }
// }

// Reverse String
// import java.util.Scanner;
// public class itself 
// {

    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the name");
//         String name = sc.nextLine();
       
//     String reversed = Reverse(name);
//     System.out.println("The Reversed name is : " + reversed);
   
//     }
    
//     static String Reverse (String name)
    
//        {
       
//         if (name.isBlank())
//         return name;
//     return Reverse(name.substring(1)) + name.charAt(0);
//     }
   
// }


// Program : Array 
// By - Azhar Sir

/*public class itself
{
    
    static int total = 0;
    public static void main(String[] args) {
       
        
        int  arr [] ={1,8,7,2};
       Sum (arr ,0);
       System.out.println(total);

    }
    
    static void Sum (int [] arr ,int b)
    {
        if (arr.length>b)
        {
            Sum (arr , b + 1);
            total += arr [b];
           
        } 
    }
}*/

//  by  - me

/*public class itself
{
    
    static int total = 0;
    public static void main(String[] args) {
       
        int  arr [] ={1,8,7,2};
       Sum (arr ,0);
       System.out.println(total);

    }
    
    static int Sum (int [] arr ,int b)
    {
        if (arr.length>b)
        {
            Sum (arr , b + 1);
            total += arr [b];
           
        } 
        return b;
    }
}*/

/*import java.util.Scanner;

public class itself 
{
static int total = 0;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the  size of array :");
        int size = sc.nextInt();
        int a [] = new int [size];

        System.out.println("Enter the element : ");
        for (int i = 0 ; i < size ; i++){
            a [i] = sc.nextInt();
        }
        
        sumArr(a, a.length-1);
        System.out.println("Sum of array is : "+total);
        
    }
    static void sumArr(int a[], int i){
        if(i>=0){
            total = total+a[i];
            sumArr(a, i-1);
        }

    }
}*/

/*import java.util.Scanner;

public class itself 
{
    public static void main(String[] args) {
      //  Scanner sc = new Scanner (System.in);
       // System.out.println("Enter the Number");
       // int num = sc.nextInt();

       // itself.Space(num,1);
       
       int num = 5;
       Space(num,1);
    }
    

    static void Star(int n) {
       if (n == 0)
       
        return;
        
        System.out.print(" * " );
       
       Star(n - 1);
    }
    

     static void Space(int num , int i) {
       if (num == 0)
       
        return;
        Star(i);
        System.out.println("  ");
       
        Space (num - 1 , i + 1);
    }*/
   
  /*public class itself
{
    static int i , a, n , j; 
    public static void main(String[] args) 
    {
        int n = 7;
        Pattern(1,n);
    }

     static void Pattern(int i, int n)
            {
 
                 if (i <= n )
              {
             
              Space(a + 1, n , i);
              Star(j + 1,i);
             
              System.out.println();
              Pattern (i +1 , n);
            }
           
        }

    static void Space (int a , int n, int i)                                                                                                
    {
        if (a <= n - i )
       
        {
            
       
        System.out.print("  ");
            
        Space(a + 1,n,i);
            
    }
    
   
}

    
        static void Star (int j , int i)
        {
            if (j <= i ) {
                
                
            System.out.print(" *  ");

            Star(j + 1, i);
        }
       
         
    }  
   
    
}*/

    

//import java.util.Scanner;

// public class itself {
//         static int i , j,k;
//         public static void main(String[] args) {
//             //Scanner sc = new Scanner (System.in);
//            // System.out.println("Enter the Value");
//             //int n = sc.nextInt();
//             int n = 19;
//         Row(1,n);
//         }
//         static void  Row(int i , int n)
//     {
//         if (i<=n)
//         {
//              Space( 1, n , i);
             
//              Star(j + 1 , i );
//              Star2(j + 1 ,i);
            
//             System.out.println();
//             Row (i +1 , n);
//         }

//     }
//      public static void Space (int k , int n , int i)
//     {
//         if (k<= n - i){
//             System.out.print("  ");
//             Space (k + 1 , n , i);
//         }
//     }
//     public static void Star ( int j , int i)
//     {
//          if ( i == 1 || i == 2  || i==3 || i == 4 &&(j==3) || i ==5 && (j== 4) || i==6&&(j==6)||i==7){
           
//         System.out.print(" ");
//        // Star(j + 1,i);
//     } 
//     else
//     {
//         System.out.print("* ");
//     }
    
//     }
//     static void Star2 (int j , int i)
//     {
//         if (i==1 || i ==2 || i==3 && (j==2) || i == 5 || i == 6 && (j==2||j==3) || i ==7){
           
        
//             System.out.print("   ");
//         //Star2(j + 1,i); 
//         }
//         else 
//         {
//             System.out.print("* ");
//         }
//     }
    
// }

  
    

   


    
