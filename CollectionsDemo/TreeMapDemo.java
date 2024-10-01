package CollectionsDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(4, "D");
        tmap.put(2, "B");
        tmap.put(3, "C");
        tmap.put(1, "A");
        //TreeMap is in sorted order wrt key value


        System.out.println(tmap);

        Map.Entry<Integer, String> firstValue = tmap.firstEntry();
        Map.Entry<Integer,String> lastValue = tmap.lastEntry();
        System.out.println(firstValue +"  "+ lastValue);
        int size = tmap.size();
        System.out.println("Size : " + size);
        tmap.remove(2);
        System.out.println(tmap);
        tmap.clear();
        System.out.println(tmap);
    }
}
