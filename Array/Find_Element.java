package Array;

import java.util.Scanner;

public class Find_Element {
    public static void main(String[] args) {
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of element you want in array");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter the all Array Element");
        for(int i = 0 ; i < num ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to array find");
        int ArrayFind = sc.nextInt();

        for(int i = 0 ; i < num ; i++)
        {
            if(a[i] ==  ArrayFind)
            {
                System.out.println("Element found :  " + a[i] );
                break;
                
             }
            else 
            {
                System.out.println("Element not found");
            
            }
            }
               

    }
}  

