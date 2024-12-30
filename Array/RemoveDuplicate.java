package Array;

//import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int Duplicate = 0;
        int a [] = {1,2,2,3,3,4,5,6,6,7};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Array Size ");
        // int n = sc.nextInt();
        // int a[] = new int [n];
        // System.out.println("Enter the Array Element ");
        // for(int i = 0 ; i<n ; i++)
        // {
        //     a[i] = sc.nextInt();
        // }
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = i+1 ; j < a.length; j++)
            {
                if(a[i] == a[j])
                {
                    a[j] = Duplicate;
                }
            }
        }
        for(int k = 0 ; k < a.length ; k++)
        {
            if(a[k] != Duplicate)
            {
                System.out.println(a[k]);
            }

        }

    }
    
}
