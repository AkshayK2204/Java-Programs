package CollectionsDemo;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> tset = new TreeSet<>();
        tset.add("Mouse");
        tset.add("Cat");
        tset.add("Dog");
        tset.add("Mouse");
        //No duplicate elements in set
        //Elements in sorted order

        System.out.println(tset);
        String first = tset.first();
        String last = tset.last();
        System.out.println(first + " "+last);
        int size = tset.size();
        System.out.println("Size : " + size);
        tset.remove("Dog");
        System.out.println(tset);

        tset.clear();
    }
}
