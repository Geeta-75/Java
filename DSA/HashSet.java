package DSA;
public class HashSet {
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

        // size
        System.out.println("size of set is : " + set.size());

        // Print all elements
        System.out.println(set);

        // search - contains
        if(set.constains (1)) {
            System.out.println("set contains 1");
        }
        if(set.constains (6)) {
            System.out.println("does not contain ");
        }

        // Delete
        if(!set.constains(1)){
            System.out.println("does not contains 1 - we deleted 1");
        }
    }
}
