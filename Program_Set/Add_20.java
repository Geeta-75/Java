package Program_Set ;
public class Add_20 {
    public static void main(String[] args) {
        int num = 20;
        int [] a = {10,20,10,40,50};
        for(int i = 0 ; i< a.length ; i++)
        {
            for(int j = i + 1; j < a.length ; j++){
                if(a[i] + a[j] == num)
                {
                    System.out.println(i+"  " +j);
                }
            }
        }
    }
    
}

