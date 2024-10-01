package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(10);
        hset.add(20);
        hset.add(30);

        hset.remove(20);

        Iterator<Integer> it = hset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        boolean contains = hset.contains(10);

        int size = hset.size();

        hset.clear();
    }
}
