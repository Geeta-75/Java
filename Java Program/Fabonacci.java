public class Fabonacci{
      static void fabonacci ( int n ){
           if ( n <= 1 )
                return n ;
            
          else 
            return fabonacci(n-1) + fabonacci ( n-2);
}
public static void main(String args [] ){
         int  n = 7;
             for(int i = 0 ; i <= n ; i++){
                    System.out.println(fabonacci(i) + "   " );
                }
  
}
}
     