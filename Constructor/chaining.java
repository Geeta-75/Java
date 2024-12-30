package Constructor;

//public class chaining {

//     chaining(){
//         this(2);
//         System.out.println("Addition");
//     }
//     chaining(int i){
//         this(10,20);
//         System.out.println(5+i);
//     }
//     chaining(int j , int k){
//         System.out.println(j+k);
//     }
//     public static void main(String[] args) {
//         chaining obj = new chaining();
//     }
// }

public class chaining {
    static String name = "unknown";
    static int age = 0;
    static String address = "  notspecified";

    chaining() {
        this("Riya  ", 16);
        System.out.println(name + "  " + age + " " + address);
    }

    public chaining(String name, int age) {
        this("unknown  ", 0, "   not specified ");
        System.out.println(name + age + address);
    }

    chaining(String name, int age, String address) {
        // this ("Riya" , 16 , "Dewas");
    }

    void print() {

        // System.out.println("Name : " + name);
        // System.out.println("Age : " + age );
        // System.out.println("Address : " + address);
    }

    public static void main(String[] args) {
        // System.out.println(name + " " + age +" " + address);
        chaining obj = new chaining();
        obj.print();
    }
}
