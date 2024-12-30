package Array ;
import java.util.Scanner;
public class Sum {
public static void main(String [] args ){
Scanner sc =new Scanner (System.in);
System.out.print(" Enter the Array Size :  " );
int n = sc.nextInt();
int [] a = new int[n];
System.out.println(" Enter the all elements ") ;
int sum = a[0];
for(int i = 0 ; i < a.length ; i++){
a[i] = sc.nextInt();
sum += a[i];
}
System.out.println("Sum of Array are : " + sum);
}
}