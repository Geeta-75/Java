package Design_Pattern ;
public class Samosa {
    private static Samosa samosa ;
    // constructer
    private Samosa () {

    }
    // Lazy way of creating single object
    public static Samosa getSamosa () {
        // object of this class
        if(samosa == null) {
           synchronized(Samosa.class) {
            if(samosa == null) {
            samosa = new Samosa();
           }
        }
    }
        return samosa;
    }
}
