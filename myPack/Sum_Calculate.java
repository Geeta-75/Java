package myPack;

public class Sum_Calculate {
    public static int sum(int [] a , int i)
    {
        if(i <= 0){
            return 0;
        }
        return sum (a , i - 1) + a [i-1];
    } 
    public static void main(String[] args) {
        int a [] = {10,20,30,40};
        int b = sum(a, a.length);
        System.out.println(b + "   ");
    }
    
}
