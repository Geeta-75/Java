package Recursion ;
  public class Array_Sum 
  {
      public static int Sum ( int arr[] , int i )
       {
            if(i <= 0)
           {
                  return 0;
             }
         return Sum  (arr , i - 1 ) + arr [ i - 1 ];
         }
      
       public static void main(String args [] ) 
      {
            int a [] = { 10 , 20 , 30 , 40 } ;
            int n = Sum ( a , a.length );
           System.out.println( n +   "       ");
        }
}