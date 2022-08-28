package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {

    // iterator'u kullanarak listenin elemanlarini sondan basa dogru yazdirin

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        System.out.println("list = " + list); // [2, 13, 56, 23, 45, 14, 40]

        ListIterator<Integer> li1 = list.listIterator();

        // sondan basa gelebilmek icin once hasNext() next() kullanarak while ile sona gidiyoruz

        while (li1.hasNext()) { // yanda eleman oldugu surece yana git ve en sona gider

            li1.next();
        }


        while (li1.hasPrevious()) {// hasPrevious() sondan basa dogru gelebilmek icin

            System.out.print(li1.previous() + " "); // 40 14 45 23 56 13 2
        }


        /*
        Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
        Orn : list : [2,13,56,23,45,14,40] artirilmasi istenen eleman sayisi : 3
        output: [7,18,61,23,45,14,40]
         */


        ListIterator<Integer> li2 = list.listIterator();

        System.out.println("\n" + list);// [2, 13, 56, 23, 45, 14, 40]

        int n = 1;

        while (li2.hasNext()) {

            int temp = li2.next();

            if (n <= 3) {

                li2.set(temp + 5);
            }
            n++;
        }

        System.out.println(list);// [7, 18, 61, 23, 45, 14, 40]


    }
}
