package myPack;

public class Test {
    static int sum(int n){
        if (n==0)
            return n ;
            else
            return  n + sum (n-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    
}
