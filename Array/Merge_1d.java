package Array;

public class Merge_1d {
    public static void main(String[] args) {
    int a [] = {1,2,3,4,5,6,7,2};
    int b [] = {1,2,3,4,5,6,7,2,10};
    int A = a.length;
    int B = b.length;
    int C = A + B;
    int  [] c = new int [C];

    for(int i = 0 ; i < a.length ; i++)
    {
        c[i] = a[i];
    }

    for(int i = 0 ; i<b.length ; i++)
    {
        c [A + i ] = b[i];
    }
    for(int i = 0 ; i<C ; i++ )
    {
        System.out.println(c[i] + "  ");
    }
} 
}
