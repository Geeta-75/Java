package myPack;

public class Arm_Recursion {

  public static int arm(int n, int temp) {
    // int rem;
    if (n == 0)
      return temp;
    temp = (temp * temp * temp + n % 10);

    return arm(n / 10, temp);

  }

  public static void main(String args[]) {
    
    for(int i = 1 ; i < 500 ; i++){
    int temp = arm(i, 0);
    if (temp == i) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
}
