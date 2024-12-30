package Pattern;
import java.util.Scanner;
public class Star5 {
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value");
int n = sc.nextInt();
for(int i = 1; i <= n ; i++){
for(int j = 1; j<= i; j++){
System.out.print("  ");
}
for(int k = n ; k>=i ; k--){
System.out.print("  * ");}
System.out.println();
}
}
}
