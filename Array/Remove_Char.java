package Array;

import java.util.Scanner;

public class Remove_Char {
  public static void main(String[] args) {
    String str = "Riya";
    char[] a = str.toCharArray();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Character : ");
    char c = sc.next().charAt(0);
    // for (int i = 0; i < a.length; i++) {
    //   if (i == c) {
    //     System.out.println("Deleted Element : " + c);
    //     a[i] = 0;
    //     break;
    //   }
    // }
    if (c != 0) {
      System.out.println(" New Array's Element");
      for (int j = 0; j < a.length; j++) {
        if(str.charAt(j) != c) {
          System.out.println(a[j]);
        }
        
      }
      
    }
   
  }
}
