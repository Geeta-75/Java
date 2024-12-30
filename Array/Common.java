package Array;

public class Common {
    public static void main(String[] args) {
        int a  [] = {1,2,3,4,5,6,7};
        int a2 [] = {5,7,8,9,0,11,12};
        System.out.println("Common Number ");
       for(int i = 0 ; i < a.length ; i++){
        for(int j = 0;  j < a2.length ; j++){
            if(a[i] == a2[j]){
                System.out.println(a[i]);
            }
        }
       }
    }
}
