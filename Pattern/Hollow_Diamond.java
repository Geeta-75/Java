package Pattern;

import java.util.Scanner;

public class Hollow_Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = scan.nextInt();
        System.out.print("Enter the symbol you want to print : ");
        int s = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                    System.out.print("  ");
                }
                System.out.println();
                for(int j = 1 ; j < (i-1)*2 ; j++){
                    System.out.println("   ");
                }
                if(n==1){
                    System.out.println();
                }
                else{
                    System.out.println(s + "  ");
                }
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                        System.out.print("  ");
                    }
                    System.out.print(s);
                    for(int j = 1 ; j < (i-1)*2 ; j++){
                        System.out.println("   ");
                    }
                    if(n==1){
                        System.out.println();
                    }
                    else{
                        System.out.println(s + "  ");
                    }
                }
        }
    }

// public class Hollow_Diamond {
// public static void main(String[] args) {
// int n = 7;
// for (int i = 1; i <= n; i++) {
// for (int j = 1; j <= i; j++) {
// if (i + j == 4 || (i == n || j % 2 == 0)) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }

// }
