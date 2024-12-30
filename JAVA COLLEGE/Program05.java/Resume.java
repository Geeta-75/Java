import java.util.Scanner;

public class Resume {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Your Name");
        String name = sc.nextLine();
        System.out.println("Enter the Your Email Address");
        String email = sc.nextLine();
        System.out.println("Enter the your Phone Number");
        String phone = sc.nextLine();
        System.out.println("Enter your Address ____");
        String address = sc.nextLine();
        System.out.println("Enter your Summary Statement : ");
        String Summary = sc.nextLine();
        System.out.println(" Enter your Carrer Objective : ");
        String Career = sc.nextLine();
        System.out.println("Your Skills ");
        String skill = sc.nextLine();
        //System.out.println(" Your Enducations Life");
        //String School = sc.nextLine();
        System.out.println("College Name ");
        String College = sc.nextLine();
        // String Board = sc.nextLine();
        System.out.println("University");
        String University = sc.nextLine();
        // String Standard = sc.nextLine();
        System.out.println("Degree");
        String Degree = sc.nextLine();
        System.out.println("Passing Date");
        String Date = sc.nextLine();
       // System.out.println("your Personal Information ");
        System.out.println("Birth Date");
        String Birth = sc.nextLine();
        System.out.println("Nationality");
        String Nationality = sc.nextLine();
        //String Father = sc.nextLine();
        System.out.println("Status");
        String Status = sc.nextLine();
        System.out.println("Gender");
        String Gender  = sc.nextLine();
        System.out.println("Language Known");
        String Language = sc.nextLine();



        System.out.println("          Resume          ");
        System.out.println("-----------------------------------");
        System.out.println("  |Name         " +  name   );
        System.out.println("Email Address   " +  email );
        System.out.println("Phone Number    " +  phone );
        System.out.println("Address      " +  address );
        System.out.println("--------------------------------------" );
        System.out.println("Summary          " +  Summary );
        System.out.println("-------------------------------");
        System.out.println("Career Objective  :  " + Career );
        System.out.println("--------------------------------");
        System.out.println("Skills  : " + skill);
        System.out.println("---------------------------");
        System.out.println("         Education  :  " );
        System.out.println("  College     |  " + College);
        System.out.println(" University   |  " + University);
        System.out.println(" Degree       |  " + Degree);
        System.out.println(" Passing Date |  " + Date);
        System.out.println("-------------------------");
        System.out.println("          Personal Information ");
        System.out.println("Birth Date      |   " + Birth);
        System.out.println("Nationality     |   " + Nationality);
        //System.out.println("Father Name   |   " + Father);
        System.out.println("Maritial Status |    " + Status);
        System.out.println("Gender          |    " + Gender );
        System.out.println("Language Known  |    " + Language);
        System.out.println("_________________________________________");
        System.out.println();
        System.out.println("              Thankyou           ");

    }
    
}



