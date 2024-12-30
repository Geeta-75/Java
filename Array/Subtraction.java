package Array;

import java.util.Arrays;

public class Subtraction {
    public static void main(String[] args) {
        int a [] = {10,30, 50,100};
        int sub = 0;
        Arrays.sort(a);
        for(int i = a.length - 1 ; i >= 0 ; i--){
            sub = sub - a[i];
    
        if(i == (a.length - 1))
        sub = -1*sub;
        System.out.println("Array element : " + a[i]);
    }
    System.out.println("Substraction of Array Elemets are " + sub);
} 
}
