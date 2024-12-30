package Design_Pattern;

import java.lang.reflect.Constructor;

public class Example {
    public static void main(String[] args) {
        // Samosa samosa1 = Samosa.getSamosa();
        // System.out.println(samosa1.hashCode());
        // Samosa samosa2 = Samosa.getSamosa();
        // System.out.println(samosa2.hashCode());

        // System.out.println(Jalebi.getJalebi().hashCode());

        //  1. Reflection API to break singleton pattern

        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        Constructor<Samosa> constructer = Samosa.class.getDeclaredConstructor();
        Constructor<Samosa> constructor;
        constructor.setAccessible(flag:true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
    
}
