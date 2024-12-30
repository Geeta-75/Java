package Constructor;
import java.util.Scanner;

// public class Book {
     
//         String authorname ;
//         int Publishyear;

//     public Book (){
        
//         authorname = "James Gosling at Sun Microsystems";
//         Publishyear = 1995;
//          System.out.println("Author Name    :   " +  authorname);
//          System.out.println("Published Year :   " +  Publishyear);
        
//     }
        
//     public Book (Book ref){
    
//         this.authorname = ref.authorname;
//         this.Publishyear = ref.Publishyear;
//         //System.out.println(title + " " + authorname + " " + Publishyear);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the Book Name");
//         String name = sc.nextLine();
//         String n = "Java";

//         if(name.equals(n))
//         {

//         Book ref = new Book();
//         Book ref2 = new Book(ref);
//         }
//         else
//         {
//         System.out.println("Wrong Book Name");
//         }

        
//     }
    
// }

// Multiple Books Name

public class Book {
    
    String Title;
     String name; 
     static int Publishyear;

     Book ( String Title){
       String  a = "Java";
       String  b = "Ramayan";
       String  c = "Mahabharat";
         if(Title.equals(a))
{       
    Book obj1 = new Book ("Games Gosling" , 1995);
}

    else if (Title.equals(b)){
    
      Book obj2 = new Book ("Tulsidaas",1810);
}
else if (Title.equals(c))
{
    Book obj3 = new Book ("Vedvyas" , 1926);
}
    
     else{
        System.out.println("Wrong Book Name ");
     }
     }

    Book(String name,int Publishyear)
    {
         this.name=name;
        this.Publishyear=Publishyear;
        //System.out.println("Book Name : " + Book);
        System.out.println(" Author Name  : " + name);
        System.out.println("Published Year :  " + Publishyear);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name ");
     String Title = sc.nextLine();
        Book obj = new Book (  Title );
       

       
//         if(Title.equals(n))
// {       
//     Book obj = new Book ("Games Gosling" , 1995);
// }

//     else if (Title.equals(t)){
    
//       Book obj2 = new Book ("Tulsidaas",1810);
// }
// else if (Title.equals(r))
// {
//     Book obj3 = new Book ("Vedvyas" , 1926);
// }
    
//      else{
//         System.out.println("Wrong Book Name ");
//      }
    }
}

// public class Book{
//   static String Name;
// static int Publishyear;
//     Book(){
//         String a = "Ramcharitmanas";
//         String Name= "Tulsidas";
//         int Publishyear = 1810;

//         String b = "Gitanjali";
//         String Name2 = "Rabindranath Tagore";
//         int Publishyear2 = 1913;

//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the Book Name");
//         String name = sc.next();

//         if (name.equals(a))
//         {
//             System.out.println("Author name is " + Name);
//             System.out.println("Published Year is " + Publishyear);
//             //Book obj = new Book("Tulsidas",1810);
//         }
//         else if (name.equals(b)){
//             System.out.println("Author name is " + Name2);
//             System.out.println("Published Year is " + Publishyear2);
//             //Book obj2 = new Book("Rabindranath",1913);
//         }
//         else{
//              System.out.println("Wrong Book Name");  
//     }
// }
//  public static void main(String[] args) {
   
//     Book title = new Book();
//  }
// }
    



// Name Age & Address
/*public class Book {
    
   
    int Name;
    String Publishyear;

    public Book  (){
   
    Name= 15;
    Publishyear = "Dewas";

    //System.out.println("Name    :   " + Name);
    System.out.println("Author Name     :   " + Name);
    System.out.println("Address :  " + Publishyear);

    }
    public Book (Book ref){
        //this.Name=ref.Name;
        this.Name=ref.Name;
        this.Publishyear = ref.Publishyear;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Name : ") ;
        String name = sc.nextLine();
         String n = "Java";
         if(name.equals(n))
         {
           Book ref = new Book();
        Book ref2 = new Book(ref);
         }
         else {
            System.out.println("Wrong Name");
         }
        

        /*System.out.println("Enter the Age");
        int Age = sc.nextInt();

        System.out.println("Enter the Address");
        String Address = sc.nextLine();*/

        
    //}
//}

