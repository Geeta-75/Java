package myPack;

import java.util.Scanner;

public class Remove_ArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num of element you want in array");
        int num = sc.nextInt();
        int[] a = new int[num];
        System.out.println("Enter the all Array Element");
        for(int i = 0 ; i < num ; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Delete Element ");
        int d = sc.nextInt();

        for(int i = 0 ; i < num ; i++)
        {
            if(d == a[i])
            {
                for(int j = i ; j < num; j++)
                {
                    a[j] = a[j+1];
                }
                break;
            }
        }
        for(int i = 0 ; i< num -1 ; i++)
        {
            System.out.println(a[i] + "   ");
        }
    }
    
}
