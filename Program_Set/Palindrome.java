package Program_Set;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0 , rem ;
        sc.close();

        while(temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (num == rev )
        {
          System.out.println(num + " is a Palindrome Number");
        }
        else{
            System.out.println(num + " is not Palindrome Number");
        }

    }
    
}
