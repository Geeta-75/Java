package Recursion;

public class Sum_of_Array {
    static int total = 0;
    public static void main(String[] args) {
        int a [] = {10,40,20,30};
        sum(a, total);
        System.out.println(" Sum of Array By usig Recursion : " + total);
    }
    public static int sum (int [] a , int l){
        if(a.length > l){
            sum (a , l + 1);
            total += a[l];
        }
        return l;
    }
    
}
