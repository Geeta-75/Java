import java.util.Scanner;

public class Project {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("WELCOME ..... ('_')");
    System.out.println("------------------------------------------------------");
    System.out.println(" Menu ");
    System.out.println("1. Signup as a course provider");
    System.out.println("2. Login as a course provider");
    System.out.println("3. Signup as a Student ");
    System.out.println("4. Login as a Student");
    System.out.println("5. Remove as a Student");
    System.out.println("Enter Your Choice.......");
    int choice = sc.nextInt();

    switch (choice) {

      case 1:
        Provider_Signup ps = new Provider_Signup();
        ps.p_signup();
        break;

      case 2:
        Provider_Login pl = new Provider_Login();
        pl.p_login();
        break;

      case 3:
        Student_Signup sp = new Student_Signup();
        sp.Course();
        break;

      case 4:
        Student_Login sl = new Student_Login();
        sl.login();
        break;

      case 5:
        Remove r = new Remove();
        r.StRemove();
        break;

      default:
        System.out.println("INVALID");
        main(null);
        break;

    }

  }
}
