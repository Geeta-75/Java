public class Armstrog {

    public static void main(String [] args)
    {
        int number = 371, originalNumber, remainder, result=0;
        originalNumber = number;

        while( originalNumber != 0 )

        { 
            remainder = originalNumber  % 10;
            result += Math.pow(remainder,3);
            originalNumber /= 10;
        }
        if (number == result)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("not a Armstrong Number");
        }
    }
    
}
