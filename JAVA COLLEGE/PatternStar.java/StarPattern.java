
 // Star pattern G Shape

 public class StarPattern {
    static void pattern(int line) 

    { 

        int i, j; 

        for(i = 0; i < line; i++) 

        { 

            for(j = 0; j < line; j++) 

            { 

                if((j == 1 && i != 0 && i != line - 1) || 

                ((i == 0 || i == line - 1) && j > 1 && 

                j < line - 2) || (i == ((line - 1) / 2) &&  

                j > 2 && j < line - 1) || (j == line - 2 &&  

                i != 0 && i >= ((line - 1) / 2) && i != line - 1)) 

                    System.out.print("*"); 

                else

                    System.out.print( " "); 

      

            } 

            System.out.println(); 

        } 

    }

      

    // Driver code 

    public static void main (String[] args)  

    { 

        int line = 55; 

        pattern(line); 

    } 
} 
 
 
 
 
 /*public class StarPattern {
  
    public static void main(String[] args) {

        for (int i =1; i <=5; i++ ) {
            for (int j = 1; j <=  i; j++)
{
    System.out.print("*");
}
System.out.println();}

for (int i=1 ; i <=5 ; i ++)
{
    for (int j = 5; j>= i ; j --)

    {
        System.out.print("*");
    }
    System.out.println();
}
}
    }*/


   

   

