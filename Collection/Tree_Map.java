package Collection;

import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        map.put(104 , " Riya");
        map.put(106 , " Honey_Girl");
        map.put(105 , " YashRaj");
        map.put(103 , " Anshika");
        map.put(107 , " Devansh");
        map.put(102 , " Shiddhi");
        map.put(101 , " Kavya");

        System.out.println(map);
        //System.out.println(map.ceilingEntry(104));
        // map.clear();
        // System.out.println(map);
        //System.out.println(map.containsKey(104));
        //System.out.println(map.firstEntry());
        //System.out.println(map.floorEntry(104));
        System.out.println(map.get(106));
    }
    
}
