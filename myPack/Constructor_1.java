package myPack;
public class Constructor_1 {
    Constructor_1(){
        this("Dewas");
    }
    Constructor_1(String address){
        this("Riya_Rajput ", 16 );
         System.out.println("Address : " + address);
    }
    Constructor_1(String name ,int age ){
        System.out.println("Name : " + name );
        System.out.println("Age : " + age);
       
    }
    public static void main(String[] args) {
        Constructor_1 obj = new Constructor_1();
    }
}
