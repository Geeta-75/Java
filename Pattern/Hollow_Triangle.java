package Pattern;
public class Hollow_Triangle{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0 ; i <= n ; i++){
            for(int j = 0 ; j <= n+n ; j++){
                if((i + j ==n)|| (j - i == n)|| (i == n && j % 2 == 0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
//public class Hollow_Triangle {
   // public static void main(String[] args) {
    //     int n = 7;
    //     for(int i = 1 ; i <= n ; i++){
    //         for(int j = n  ; j >= i ; j--){
    //             System.out.print(" ");
    //         }
        
    //     for(int k = 1 ; k <= i ; k++){
    //         if(k==1 || i == n || k== i  ){
    //             System.out.print("  *   ");
    //         }
    //         else{
    //             System.out.print("     ");
    //         }
    //     }
    //     System.out.println();
    // }
//} 
//}
