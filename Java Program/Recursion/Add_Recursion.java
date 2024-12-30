package Recursion;
import java.util.Scanner;
public class Add_Recursion {
public static int calculate_sum(int a[] , int n){
if(n == -1){
return 0;
}
return a[n] + calculate_sum(a,n-1);
}
public static void main (String [] args ){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Array Size " );
int n = sc.nextInt();
int []  a = new int [n];
System.out.println("Enter the all Elements");
int sum = 0;
for(int i = 0 ; i < n ; i++){
a[i] = sc.nextInt();
}
System.out.println("Sum of Array using recurion : " + calculate_sum( a , n - 1));
}
}