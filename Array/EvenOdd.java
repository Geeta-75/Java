package Array;

public class EvenOdd {
    public static void main(String args[]) {

        int a[] = { 1, 2, 5, 6, 3, 7 };
        int count_even = 0;
        int count_odd = 0;

        System.out.println("Even Numbers:");

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                System.out.println(a[i]);
                count_even++;
            }
        }
        System.out.println(" Total Even Number 's are : " + count_even);
        System.out.println("Odd Numbers:");

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {

                System.out.println(a[i]);
                count_odd++;
            }
        }
        System.out.println("Total Odd Number's are : " + count_odd);
    }

}
