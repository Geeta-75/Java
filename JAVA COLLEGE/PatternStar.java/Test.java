public class Test {

    public static void main(String[] args) {
        
       for  (int i = 1 ; i<= 3 ; i ++)
       {
        for (int j = 1 ; j <= i ; j ++)
        {
            System.out.print(" ");
        }
        for (int k = 3 ; k>= i ; k --)
        {
            System.out.print("* ");
        }
    
        System.out.println();
       }
       for ( int l = 1 ; l <= 5 ; l ++)
       {
        if (l % 2 == 0 )
        {
            System.out.print(" ");
        }
        else{
            System.out.print("* ");
        }
       }
    }
    
}
