package Recursion;
 public class Palindrome_R
  {
      public static int rev (int n , int temp )
       {
           if(n==0)

                     return temp ;

                    temp = ( temp * 10 + n % 10);
                    return rev ( n / 10 , temp );
             }

      public static void main(String args [] ){

        int n = 122;
        int temp = rev(n,0);
        if(temp == n ){
        System.out.println("It's a Palindrome");
         }
         else {
           System.out.println("It's  not a Palindrome");
           }
     }
}
        
       