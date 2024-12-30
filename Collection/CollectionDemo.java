package Collection;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("Riya");
        al.add(16);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add("Geeta");
        al2.add(17);
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);
    }
}
