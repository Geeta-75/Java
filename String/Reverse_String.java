package String;

import java.util.Scanner;

public class Reverse_String {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Name");
    char[] name = sc.nextLine().toCharArray();
    System.out.println("Reverse String ");
    for (int i = name.length - 1; i >= 0; i--) {
      System.out.print(name[i]);
    }
    System.out.println();

  }

}
