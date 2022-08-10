package day43_interface_iterator.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

    /*
    Java iterator, collection elemanlarimizin arasinda gezinmemizi ve elemenlari
    degistirmemize yarar.

    Collections'da her element index yapisini desteklemez,index olmadan tum elementlere
    ulasmak ıcın for-each loop kullanabiliriz ancak for-each loop ile elementleri kalici
    olarak degistirme veya silme imkani olmadigi icin Iterator kullanimini tercih ederiz.
     */
    public static void main(String[] args) {
        // Java iterator, collection elemanlarimizin arasinda gezinmemizi
        // ve elemanlari degistirmemize yarar,index yapisini desteklemez.

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("list = " + list); // [10, 20, 30]

        // list'deki tum elemanlari INDEX KULLANMADAN 3 artirin.

        for (Integer w : list
        ) {
            w += 3;
            System.out.print(w + " "); // 13 23 33 kalici degisiklik olmaz sadece scopeda gecerli
        }

        System.out.println("");
        System.out.println("for'dan sonra list = " + list);

        /*
        Java index yapisi olmayan collection'lardaki elementlere ulasmak
        veya degistirmek icin Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir.

        Bunun yerine bize iterator donduren list.iterator() method'unu kullaniyoruz.
         */

        System.out.println("list = " + list);

        Iterator<Integer> it1 = list.iterator();

        System.out.println("it1.next() = " + it1.next()); // 10
        System.out.println("it1.next() = " + it1.next()); // 20
        System.out.println("it1.next() = " + it1.next()); // 30
        //System.out.println("it1.next() = " + it1.next()); // 30'dan sonra element kalmadigindan RTE verir.

        /*
        Iterator'da geri donus yok, adim adim sonra ulastiktan sonra
        basa donmek isterseniz yeniden bir iterator olusturmaniz gerekir.
         */

        Iterator<Integer> it2 = list.iterator();

        // yeni it2'yi kullanarak list'in tum elemanlarini silelim.

        System.out.println("list = " + list);// [10, 20, 30]
        it2.next(); // 10
        it2.remove(); // 10 u sildi.
        System.out.println("list = " + list); // [20, 30]
        it2.next(); // 20
        it2.remove(); // 20 yi sildi
        System.out.println("list = " + list); // [30]
        it2.next(); // 30
        it2.remove(); // 30 u sildi
        System.out.println("list = " + list);// []
        /*
        iterator ile elementleri gezip, remove yapinca list kalici olarak degisti.

        Iterator'da kullanilabilen 3 method; hasNext(),next(),remove()  !!!
         */


        // list'i tekrar doldurduk
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("yeniden list = " + list); // [10, 20, 30]

        Iterator<Integer> it3 = list.iterator();

        while (it3.hasNext()) {

            it3.next();
            it3.remove();
        }
        System.out.println("loop'tan sonra list = " + list); // [] tum elementleri sildik
        /*
        Goruldugu gibi Iterator kullanarak yapabildigim
        1 - tum collection elementlerini yazdirmak,
        2 - tum collection elementlerini silmek,
        bu da bize yetmez.
         */

    }
}
