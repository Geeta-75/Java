package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sub_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size :  ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Array all Elements ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sub = 0;
        for(int i = n - 1; i >= 0 ; i--){
            sub = sub - a[i];
            if(i == (n - 1))
                sub = -1*sub;
                System.out.println("Array : " + a[i]);
            }
            System.out.println("Subtraction of all elements in array in decreasing order " + sub);

            }
        }
    


