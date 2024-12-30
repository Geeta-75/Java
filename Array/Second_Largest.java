package Array;

public class Second_Largest {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,7};
        int large = 0;
        int Second_Largest_No = 0;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i ] > large){
                Second_Largest_No = large ;
                large = a[i];
            }
        }
        System.out.println(Second_Largest_No);

    }
    
}
