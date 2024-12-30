package Program;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = sc.nextInt();
        int temp = 0;
        for(int i = 2 ; i<=num ; i++)
        {
            temp = temp + 1;
        }
    }

    if(temp == 0)
    {
        System.out.println(num + " is a Prime Number");
    }
    else{
            System.out.println(num + " is a not Prime Number");
    }
}
