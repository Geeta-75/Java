import java.util.Scanner;

public class RHOMBUSprogram {

    public static void main ( String [] args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Row");
        int Row = sc.nextInt();
        System.out.print("Enter Symbol");
        char c = sc.next().charAt (0);

        for ( int i = 1 ; i <= Row ; i ++)
        {
            for (int j = i - 1 ; j >= 1 ; j --)
            {
                System.out.print("   ");
            }

            for ( int j = 1 ; j <= Row ; j ++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    
}
