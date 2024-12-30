package Recursion;

public class Prime {
    static boolean isprime (int n , int i ){
        if(n <= 2)
            return(n==2);
            if(n % i == 0)
            return false;
            if(i * i > n)
            return true;
            return isprime(n, i + 1);        
    }
    public static void main(String[] args) {
        int n = 3;
        if(isprime(n, 2))
        System.out.println( n + " number is prime ");
        else
        System.out.println( n + " number is not prime ");
    }
    
}
