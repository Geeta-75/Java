package Array;

import java.util.Scanner;

public class Remove_specific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of element you want in array : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the all Array Element");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the Delete element you want to  :  ");
        int d = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (d == a[i]) {
                System.out.println("Deleted Element : " + a[i]);
                a[i] = 0;
                break;
        }
        }
        
        for (int i = 0; i < n ; i++) {
           if(a[i] != 0){
               System.out.println(a[i]);
           }
        }
    }

}
