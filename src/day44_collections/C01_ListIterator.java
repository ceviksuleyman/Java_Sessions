package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
       /*
     Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …
     (2. liste olusturmadan, gecerli liste uzerinde islem yapiniz)
     Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
     output: [23,40]
     */

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

        ListIterator<Integer> li = list.listIterator();

        int baslangicSinir = 20;
        int bitisSinir = 40;

        while (li.hasNext()) {

            int temp = li.next();

            if (temp < baslangicSinir || temp > bitisSinir) {

                li.remove();
            }
        }
        System.out.println("while loop'tan sonra list = " + list); // [23, 40]


    }
}
