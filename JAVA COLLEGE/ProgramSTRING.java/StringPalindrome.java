import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
      

        StringPalindrome obj = new StringPalindrome ();
       obj.StringPalindrome();
    }

       void StringPalindrome ()
       {
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Name");
        String name = sc.nextLine();
        String rev = " ";
        
       
        
        for (int i = name.length() - 1 ; i >=0 ; i--)
        {
            rev+=name.charAt(i);
        }
        System.out.println(rev);
       

        if (name.equals(rev))
        {
            System.out.println("Name is Palindrome");
        }
        else 
        {
            System.out.println("Name is not Palindrome");
        }
    }
}  




// Loop StringPalindrome

/*public class StringPalindrome {
    public static void main (String [] args) {

     System.out.println("Nitin");
      System.out.println("Jitin");
    }
    
    public  boolean isPalindrome (String str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String rev = sb.toString();
        {
            return true;
        
        }
        else
        {
            return false;
        }
    }
}*/





// Static Simple Program 


/*public class StringPalindrome {

    public static void main(String[] args) {
        show();
    }

        static void show() 
        
        
    {
        System.out.println("Hello World");
    }
}*/

      


