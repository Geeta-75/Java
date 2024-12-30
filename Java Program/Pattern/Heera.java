package Pattern;
import java.util.Scanner;
public class Heera {
public static void main(String args []){
Scanner s = new Scanner (System.in);
System.out.println("Enter the Num " );
int n = s.nextInt();
for(int i = 1 ; i <= n ; i++){
for(int j = i ; j <= n - 1  ; j++){
System.out.print("   ");
}

for(int j = 1 ; j <=  i ; j++){
System.out.print(" * ");}
for(int j = 1 ; j <= i ; j++){
System.out.print(" * ");}
System.out.println();
}
for(int i = 1 ; i <= n; i++){
for(int j = 1; j <= i  ; j++){
System.out.print("   ");
}

for(int j = i ; j <= n; j++){
System.out.print(" * ");}
for(int j = i ; j <= n ; j++){
System.out.print(" * ");}
System.out.println();
}
}
}

