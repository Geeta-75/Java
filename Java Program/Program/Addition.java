package Program;

import java.util.Scanner;
public class Addition {
public static void main(String [] args ){
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Size of Array");
int n = sc.nextInt();
int a [] = new int [n];
System.out.println("Enter the Elements " );
int sum = 0;
for(int i = 0; i < n ; i++){
a[i] = sc.nextInt();
}
for(int i = 0 ; i < n ; i++){
sum += a[i];
}
System.out.println("Addition of Array elements : " + sum );
}
}