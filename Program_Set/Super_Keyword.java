 package Program_Set;

// public class Super_Keyword {
//     int a = 10;
    
// }
// class B extends Super_Keyword{
//         int a = 20;
//         void show (){
//         System.out.println("  " + super.a);
//         System.out.println("  " + a);
//     }
// }

// class print {
//     public static void main(String[] args) {
//         B b = new B();
//         b.show();
//     }
// }

//  class A {
//     void show()
//     {
//         String a = "Riya";
//         System.out.println("Hey " + a);
//     }
// }
// class B extends A {
//     void show ()
//     {
//         super.show();
//         System.out.println("Happy Birthday ! ");
//     }
// }
// public class Super_Keyword {
//    public static void main(String[] args) {
//     B a = new B();
//     a.show();
    
//    }
// }


class A {
    A ()
    {
        System.out.println("I am Cute Girl ! ");
    }
}
class B extends A {
    B()
    {
        System.out.println("Ohh Really ! you are Right ");
    }
}
public class Super_Keyword{
    public static void main(String[] args) {
        B b = new B();
    }
}