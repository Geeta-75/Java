package Recursion;
import java.util.Scanner;
public class Sum_Calculate{
public static int find_sum(int a[] , int n ){
if(n <= -1 ){
return 0;}
return (find_sum(a,n-1) + a[n-1]);
}
public static void main(String [] args ){
Scanner sc = new Scanner (System.in);
System.out.print("Enter the Size of Array : ");
int n = sc.nextInt();
int a[] = new int [n];
System.out.println("Enter the Array Elements");
for(int i = 0 ; i < n ; i++){
a[i] = sc.nextInt();
}
System.out.println(find_sum(a,n-1));
}
}