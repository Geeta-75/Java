import java.util.Scanner;

public class StringProgram {

    public static void main(System args [], String string)
    {
        String a,b;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the First String");
         a = s.nextLine();
          
        System.out.println("Enter the Second String");
         b = s.nextLine();

        String name = a.concat(b);
        System.out.println(name);
    
}
}
