package DSA;

import java.util.HashSet;

public class Hashing_Set {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // List.add(el)
        set.add(2);
        set.add(4);

        // search - contains
        if(set.contains (1)) {
            System.out.println("set contains 1");
        }
        if(set.contains (6)) {
            System.out.println("does not contain ");
        }

        // Delete
        if(!set.contains(1)){
            System.out.println("does not contains 1 - we deleted 1");
        }
    }
}
