package day43_interface_iterator.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator02 {

    public static void main(String[] args) {

        /*
        ListIterator Iterator interface'inin child interface'idir, ama daha cok
        method'a sahiptir.
         */
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("list = " + list); // [10, 20, 30]

        ListIterator<Integer> lit1 = list.listIterator();

        int temp;

        while (lit1.hasNext()) {

            temp = (int) lit1.next();

            lit1.set(temp + 3);
        }
        System.out.println("list = " + list); // [13, 23, 33]


    }
}
