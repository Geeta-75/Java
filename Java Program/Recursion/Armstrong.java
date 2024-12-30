package Recursion;
public class Armstrong 
{
    
    public static int arm ( int temp , int rev )
   {
    int rem;
         if(temp != 0)
       {
              rem = temp % 10;
              rev = rev + ( rem * rem * rem );
                temp = temp / 10;
                return arm ( temp , rem);
}
return rev;
}

public static void main (String args [] ){
   int n = 153;
   int temp = arm(n , 0 );
   if( n == temp )
   {
          System.out.println("Yes");
   }
   else {
     System.out.println("No");
     }
  }
}
   