package Recursion;

// import java.util.Scanner;

public class Armstrong {
    int temp ;
    int findArmstrong (int n , int a){
        if(n != 0){
            temp = n % 10;
            a = a + (temp * temp * temp);
            n /= 10;
            return findArmstrong(n, a);
        }
        return a;

    }
    public static void main(String[] args) {
        Armstrong A = new Armstrong();
        int arm;
        System.out.println(" Armstrong Number ");
        for(int num = 1 ; num < 500 ; num++){
            arm = A.findArmstrong(num,0);
            if(arm == num){
                System.out.println(num);
            }
        }
    }
}
