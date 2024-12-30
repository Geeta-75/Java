package myPack;

public class Swastik {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 1 && (j == 2) || i == 1 && (j == 3) || i == 2 && (j == 2) || i == 2 && (j == 3)
                        || i == 2 && (j == 5) || i == 2 && (j == 6) || i == 2 && (j == 7) || i == 3 && (j == 2)
                        || i == 3 && (j == 3)
                        || i == 3 && (j == 5) || i == 3 && (j == 6) || i == 3 && (j == 7)
                        || i == 5 && (j == 1) || i == 5 && (j == 2) || i == 5 && (j == 3) || i == 5 && (j == 5)
                        || i == 5 && (j == 6)
                        || i == 6 && (j == 1) || i == 6 && (j == 2) || i == 6 && (j == 3) || i == 6 && (j == 5)
                        || i == 6 && (j == 6) || i == 7 && (j == 5) || i == 7 && (j == 6)) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }

}

// import java.util.Scanner;
// public class Swastik{
// public static void main (String[] args){
// int n;
// Scanner sc=new Scanner(System.in);
// System.out.print("Enter the row and col value <Select a number between 10 to
// 50 > :- ");
// n=sc.nextInt();
// sc.close();
// int row = n, col = n;
// for (int i = 0; i < row; i++) {
// for (int j = 0; j < col; j++){
// if (i < row / 2){
// if (j < col / 2){
// if (j == 0)
// System.out.print(".");
// else
// System.out.print(" "+ " ");
// }
// else if (j == col / 2)
// System.out.print(" .");
// else{
// if (i == 0)
// System.out.print(" .");
// }
// }
// else if (i == row / 2)
// System.out.print(". ");
// else{
// if (j == col / 2 || j == col - 1)
// System.out.print(". ");
// else if (i == row - 1){
// if (j <= col / 2 || j == col - 1)
// System.out.print(". ");
// else
// System.out.print(" "+ " ");
// }
// else
// System.out.print(" "+" ");
// }
// }
// System.out.print("\n");
// }
// };
// }