package String;

public class Reverse_Sentance {
    public static void main(String[] args) {
        String str = "I am Fine";
        char[] a = str.toCharArray();
        System.out.println("Reverse Sentance ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.println();

    }

}
