package Collection;

import java.util.HashSet;
import java.util.Set;
 

public class SetDemo {
   public static void main(String[] args) {
    Set s = new HashSet();
     s.add(10 );
     s.add(20);
     s.add(30);
     s.add(10);
     System.out.println(s);
   }

}
