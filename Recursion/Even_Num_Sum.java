package Recursion;

public class Even_Num_Sum {
    static int calculateEvenNumberSum(int[] arr) {
        return calculateEvenNumberSum(arr, 0);
    }

    private static int calculateEvenNumberSum(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        int sum = calculateEvenNumberSum(arr, index + 1);
        if (arr[index] % 2 == 0) {
            sum += arr[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = { 5, 5, 5, 5, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6 };
        int sum = calculateEvenNumberSum(a);
        System.out.println("The sum of all Even numbers in the array is: " + sum);

    }

}
