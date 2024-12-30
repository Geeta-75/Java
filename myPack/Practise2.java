 package myPack;

// public class Practise2 {
//     public static void main(String[] args) {
//         double Radius = 7.5 , pi = 3.14;

//         double C = pi*Radius;
//         System.out.println("Area of Perimeter : " + C);
//        double Circle = pi*Radius*Radius;
//        System.out.println("Area of Circle : " + Circle);


        
//     }
    
// }

public class Practise2{
    public static void main(String[] args) {
        System.out.println("Divided by 3");
        for(int i = 1 ; i <= 100 ; i++)
        {
            if(i % 3 == 0)
            {
                System.out.print(i + " , ");
            }
        }
        System.out.println("Divided by 5");
        for(int i = 1 ; i <= 100 ; i++)
        {
            if(i % 5 == 0)
            {
                System.out.print(i + " , ");
            }
            
        }
        System.out.println("Divided by 3 & 5");
        for(int i = 1 ; i <= 100 ; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.print(i + " , ");
            }
        }

    }
}
