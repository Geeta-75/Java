package Program;
import java.util.Scanner ;
public class Maximum {
public static void main (String [] args ) {
Scanner sc = new Scanner ( System.in ) ;
System.out.println("Enter the Array Size ");
int n = sc.nextInt();
int a [] = new int [n];
System.out.println("Enter the Elements");
int max = a[0];
for(int i = 0; i< n ; i++){
a[i] = sc.nextInt() ;
}
for(int i = 0 ; i < n ; i++){
if(max < a[i]){
max = a[i];
}
}
System.out.println("Maximum Number : " + max );
}
}

