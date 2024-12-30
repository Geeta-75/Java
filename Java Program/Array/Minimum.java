package Array ;
import java.util.Scanner;
public class Minimum{
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Array Size : " );
int n = sc.nextInt();
int a [] = new int[n];
System.out.println("Enter the Array Elements ");
for(int i = 0 ; i < a.length ; i++){
a [i] =sc.nextInt();
}
int min = a[0];
System.out.println("Minimum Number " );
for(int i = 0 ; i < n ; i++){
if(min > a[i]){
min = a[i];
}
}
System.out.println(min);
}
}
