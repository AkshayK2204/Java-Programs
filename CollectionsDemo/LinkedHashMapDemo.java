package CollectionsDemo;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<>();
        lhmap.put(1, "Paris");
        lhmap.put(2, "London");
        lhmap.put(3, "New York");
        //lhmap.put(1, "Spain"); // this will replace Paris at key 1
        lhmap.put(4, "London"); //duplicate elements can exist with different key values
        System.out.println(lhmap);
        lhmap.remove(2);
        System.out.println(lhmap);
        String value = lhmap.get(1);
        System.out.println(value);

        boolean containsKey = lhmap.containsKey(1);
        boolean containsValue = lhmap.containsValue("New York");
        if(containsValue && containsKey)
        {
            System.out.println("New York exists at key 1");
        }

        int size = lhmap.size();

        lhmap.clear();
    }
}
