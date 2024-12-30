package Inheritance;

 class M {
    public void Name(){
        System.out.println("Hey ! I am Riya ");
    }
    
}
class P extends M{
    public void Address(){
         System.out.println("   Dewas");
    }
}
class Q extends P{
    public void Strength() {
     System.out.println("I am Self Motivating Person ");
    }
}

public class Multilevel{
    public static void main(String[] args) {
        Q q = new Q();
        q.Name();
        q.Address();
        q.Strength();
    }
}
