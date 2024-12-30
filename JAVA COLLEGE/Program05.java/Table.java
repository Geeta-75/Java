import java.util.Scanner;

public class Table {


    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number ");
        System.out.println("-----------------");
        int n = sc.nextInt();
        


        for (int i = 1; i <=  n; i ++)
         {
            for (int j = 2; j <= 10; j ++)
        {


        System.out.println(i  + "*" + j + "=" + i * j);
        }
{
        System.out.println("--------------");
}
    
        }

         }
    } 



 