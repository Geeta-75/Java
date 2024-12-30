//method

/*public class Sum {

    static void myMethod() 
    {
        System.out.println("My Name is Riya");
    }
    public static void main(String[] args) {
        myMethod();
    }
}*/


// addition
 /*public class Sum {
   
  public static void main(String[] args) {

    A (10,20);
    A (30,40);
    }
  static void A (int a , int b)
  {
    System.out.println(a+b);
  }
}*/

//Add

/*public class Sum {
  int a = 5;
  static int b = 7;
  public static void main(String[] args) {
    
    Sum a1 = new Sum();

    System.out.println(a1.a+b);
    
}
}*/

// Non Static 

public class Sum{
  int a = 5;
  static int b = 7;
  public static void main(String[] args) {
    
    Sum obj = new Sum();
    obj.Sum();

  }
  void Sum()
  {
    System.out.println("Sum = " + ( a + b));
  }
  
}
