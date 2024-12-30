package Program_Set;

public class Unique_Num {
    public static void main(String[] args) {
        int n = 4;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (i != k && i != j && j != k) {
                        System.out.println(i + " " + j + " " + k);
                        count++;
                    }
                }
            }
            System.out.println("---------------------------------");
        }
        System.out.println("Total Element : " + count);
    }

}
