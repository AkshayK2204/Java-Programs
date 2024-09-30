package CollectionsDemo;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<Integer> oddNum = new ArrayList<>();
        oddNum.add(1);
        oddNum.add(3);
        oddNum.add(5);
        oddNum.add(7);
        oddNum.add(9);
        System.out.println(oddNum);

        ArrayList<Integer> evenNum = new ArrayList<>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        evenNum.add(8);
        evenNum.add(10);
        System.out.println(evenNum);

        ArrayList<Integer> Num = new ArrayList<>();
        Num.addAll(oddNum);
        Num.addAll(evenNum);
        System.out.println(Num);
        Num.sort(Comparator.reverseOrder());
        System.out.println(Num);
    }
}
