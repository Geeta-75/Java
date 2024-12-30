package DSA;
import java.util.*;
 public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add elements
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(12);
        System.out.println(list);

        // to get an element
        int element = list.get(0); // 0 is the box
        System.out.println(element);

        // add element in between
        list.add(1,2);

        // set element
        list.set(0, 0);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i =0 ; i <list.size() ; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        //list.add(1,1);
        Collections.sort(list);
        System.out.println(list);

 
    }
}
