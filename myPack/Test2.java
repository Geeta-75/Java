package myPack;

public class Test2 {
    public static void main(String[] args) {
        int [] a = {1,4,5,6,8,9,2};
        for(int i = 0 ; i< a.length - 1 ; i++){
            for(int j = i ; j < a.length - 1 ; j++)
            if(a[i] > a[j+1]){
                int temp = a[i];
                a[i] = a[j+1];
                a[j+1] = temp;
            
            System.out.println(a[i]);
        }
    }
}
}
