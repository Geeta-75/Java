package Pattern;
import java.util.Scanner;
public class Star8 {
public static void main(String args []){
Scanner s = new Scanner (System.in);
System.out.println("Enter the Num " );
int n = s.nextInt();

for(int i = 1 ; i <= n ; i++){
for(int j = 1; j <= i ; j++){
System.out.print("  *  " );
}
for(int j = n ; j >= i ; j--){
System.out.println("    " );
}
System.out.println( );


}
}
}

