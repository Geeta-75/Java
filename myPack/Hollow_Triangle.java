package myPack;

public class Hollow_Triangle {
   public static void main(String[] args) {
    int n = 7;
    for(int i = 0 ; i <= n ; i++){
        for(int j = 0 ; j <= n+n ; j++){
            if((i + j == n) || (j - i == n) || (i == n && j % 2 == 0)){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
   }
}
