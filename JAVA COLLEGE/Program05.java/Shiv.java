import java.util.Scanner ;

public class Shiv {

    public static void main(String[] args) {
        
        int year ;

        Scanner s = new Scanner (System.in);
        System.out.println("Enter the year");
        year = s.nextInt();
        s.close();
        boolean isLeap = false;
        
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                isLeap = true ;
                else 
                isLeap = false;
            }
           
            else
            isLeap =true;
            }
           
            else
        {
            isLeap = false;
        }

        if (isLeap == true )
        
            System.out.println(year + " is a Leap year ");

         else
         
        System.out.println(year + "  is not a Leap year ");
    }
}   



/*public class Shiv {
 public static void main(String[] argn){
    int c = 25;
    if (c > 50)
{ System.out.print("Pass");
}
else
{System.out.print("Fail");
}
}
}*/

