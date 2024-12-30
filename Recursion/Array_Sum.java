package Recursion;

// public class Array_Sum {
//     public static int Sum ( int arr [] , int i ,int  n ){
//         if(i == n-1){
//             return arr[i];
//         }
//         return (arr[i] + Sum(arr, i+1, n));
//         }
//         public static void main(String[] args) {
//             int a [] = {1,9,10,30};
//             int n = a.length;
//             System.out.println(Sum( a, 0 ,n));
//         }
//     }


public class Array_Sum{
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,5};
        int n = Sum(a, a.length);
        System.out.println(n + "  ");

    }
    public static int Sum (int [] arr , int l) {
        if(l <= 0){
            return 0;
        }
        return Sum (arr , l-1) + arr [l-1];
        
    }
}

    

