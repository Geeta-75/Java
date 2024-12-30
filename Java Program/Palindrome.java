public class Palindrome{
 public static int rev ( int n , int temp )
   {
            if( n==0 )
          return temp;
            
     temp = ( temp * 10 + n % 10 );
     return rev ( n / 10 , temp ); 
   }
    public static void main (String args [] ){
         int n = 121 ;
         int isPrime = rev ( n , 0);
          if( n == isPrime)
          {
                 System.out.println(" It's Palindrome ");
          }
          else{
                        System.out.println("  It's not Palindrome" );
                  }
             }
      }
            