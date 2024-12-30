package Array;

import java.util.Arrays;

public class Second_Smallest {
    public static void main(String[] args) {
        int[] a = { 2, 4, 3, 4, 5, 7 };
        int min = a[0];
        int Second_Smallest_No = a[0];
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a);
            if (a[i] < min) {
                Second_Smallest_No = min;
                min = a[i];
            }
        }
        System.out.println(Second_Smallest_No);
    }
}
