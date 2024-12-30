package Array;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] a = { 8, 7, 6, 5, 4, 3, 2, 1 };
        String[] a2 = { "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++" };
                System.out.println("Original Numeric Array : " + Arrays.toString(a));
                Arrays.sort(a);
                System.out.println("Sorted Numeric Array : " + Arrays.toString(a));
                System.out.println("Original String Array : " + Arrays.toString(a2));
                Arrays.sort(a2);
                System.out.println("Sorted String Array : " + Arrays.toString(a2));
    }
}
