package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Car");
        list.add("Bike");
        list.add("Bus");

        list.addFirst("Train");
        list.addLast("Plane");

        String first = list.getFirst();
        String last = list.getLast();

        //String first2 = list.poll(); //poll deletes the first element and returns
        String first1 = list.peek();
        String last1 = list.peekLast();

        list.add(2,"Truck");
        //System.out.println(list.get(2));
        System.out.println(first + "\t" + last );
        System.out.println(first1 + "\t" + last1 );
        //peek() is safer since it returns null if list is empty, but getFirst() throws an exception
        System.out.println(list.toString());

    }
}
