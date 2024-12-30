package Recursion;

public class Reverse_Array {
    public static void reverse (int [] arr , int start , int end){
        if(start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }
}
static void printArray(int [] arr){
    for(int i : arr){
        System.out.println(i + "  ");
    }
}
public static void main(String[] args) {
    int a [] = {1,7,9,5,4,3,2};
    System.out.println("Original Array ");
    printArray(a);
     reverse(a,0,a.length-1);
    System.out.println("Reversed Array");
    printArray(a);
}
}
