package String;

import java.util.Arrays;

public class Array_String {
    public static void main(String[] args) {
        fun(16, 12, 10, 5, 18);
        fun("Riya ", " Anvi ", " Shiddhi ", " Kavya ", " YashRaj ");
    }

    static void fun(int... v) {
        System.out.println("Age : " + Arrays.toString(v));
        System.out.println("----------------------------------------------");
    }

    static void fun(String... v) {
        System.out.println(" Name : " + Arrays.toString(v));
    }
}
