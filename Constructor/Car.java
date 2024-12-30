package Constructor;
 import java.util.Scanner;

// public class Car {
   

//     String name = "Nano";
//     int year = 2000;
//     String brand = "TATA";
//     void cardetails(){
//       System.out.println("Car name : "+name);
//       System.out.println("Lonching year : "+year);
//       System.out.println("Brand : "+ brand);
//     }
// }
// //    public Car (String name , int num , String Choose){
// //         System.out.println(name +"  " + num + "   " + Choose);
// //     }

// class print extends Car{


//     public static void main(String[] args) {
//       print obj = new print();
//       obj.cardetails();
//     }
// }


public class Car{
    String brand;
     Car(String brand){
    this.brand = brand ;
    System.out.println("Brand Name : " + brand);
    }
  }
   class Vehicle extends Car {
  int num;
   Vehicle(String brand , int num){
    super(brand);
    this.num = num;
    System.out.println(num);
  }
   }
   class main{
  public static void main(String[] args) {
    Vehicle obj = new Vehicle("kia",4);
   
  }
  }
  

