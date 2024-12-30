package My_Pack;

public class Practise {
   public static void main(String[] args) {
    int [] a = {1,2,3,4,5,6,7};
    int max = a[0];
    System.out.println("Maximum Number ");
    for(int i = 0 ; i < a.length ; i++){
        if(max < a[i]){
            max = a[i];
        }
    }
    System.out.println(max);
   } 
}
