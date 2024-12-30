public class Animal {
    int age;
    String colour;
    void obj(int a , String c){
        age = a;
        colour = c;
    }
    void display(){
        System.out.println("Animal Age =    " +age + "  ,  " + "Animal Colour =  " + colour);
    }
    public static void main(String[] args) {
        Animal Dog = new Animal();
        Dog.obj(16 ," Black ");
        Dog.display();
    }
    
}
