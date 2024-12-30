package Program_Set;


import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        sc.close();

        if(year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println(year + " is Leap Year ");
                }
                else{
                    System.out.println(year + " is not  Leap Year ");
                }
            }
             else{
                    System.out.println(year + " is Leap Year ");
                }
        }
        else{
            System.out.println(year + " is not Leap Year ");
        }
    }
}


// import java.util.Scanner;

// public class LeapYear {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Year");
//         int year = sc.nextInt();
//         sc.close();

//         if(( year % 4 == 0 ) && (year % 400 == 0 || year != 0))
//         {
//             System.out.println(year + " is Leap Year");
//         }
//         else{
//             System.out.println(year + " is not Leap Year");
//         }
//     }
// }


