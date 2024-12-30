package Array;

public class Average {
    public static void main(String[] args) {

        double[] a = { 200, 16.5, 19, 13.73, 12.89 };
        double total = 0;

        for (int i = 0; i < 5; i++) {
            total = total + a[i];
        }
        double average = total / a.length;
        System.out.format(" The average is  : % 3f ", average);

    }

}
