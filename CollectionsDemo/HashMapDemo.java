package CollectionsDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "John");
        hmap.put(2, "Jane");
        hmap.put(3, "Tom");
        System.out.println(hmap);
        hmap.remove(2);

        String value = hmap.get(1);

        boolean containsKey = hmap.containsKey(1);
        boolean containsValue = hmap.containsValue("Tom");
        if(containsKey && containsValue){
            System.out.println("Person named Tom exists at index 1");
        }
        int size = hmap.size();
        System.out.println(hmap + " \n" + "Size : "+size);
        hmap.clear();
        System.out.println(hmap);
    }
}
