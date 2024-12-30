package Recursion;

public class Odd_Num_Sum {
    static int calculateOddNumberSum(int[] arr) {
        return calculateOddNumberSum(arr, 0);
    }
    private static int calculateOddNumberSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        int sum = calculateOddNumberSum(arr, index + 1);
        if (arr[index] % 2 != 0) {
            sum += arr[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the Array Size : ");
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // System.out.println("Enter the all Elements");
        // for (int i = 0; i <= n; i++) {
        //     a[i] = sc.nextInt();
        // }
        int [] a = {5,7,5,7,5,7,5,3,3,3,4,4,4,4,2};
        int sum = calculateOddNumberSum(a);
        System.out.println("The sum of all odd numbers in the array is: " + sum);
    }
}
