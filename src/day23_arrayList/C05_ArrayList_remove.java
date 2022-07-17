package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ArrayList_remove {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);
        System.out.println("sayilar1 listinin ilk durumu : "+sayilar1);

        //== NOTE  remove() !! ==
        // Sayilardan olusan bir list varsa java remove method'unda sayi yazdigimizda direk index olarak kabul eder.
        sayilar1.remove(1);//1. index'de bulunan 3'u silicek
        System.out.println(sayilar1);// [5, 2, 1]

        //istedigim index'deki sayiyi illa silmek istersem ?? Bir obje olusturduk ve silmek istedigimiz sayiyi tanimladik
        Integer sil = 5;
        sayilar1.remove(sil); // tanimladigimiz objeyi remove() methodu ile kullandik ve bu sekilde silmis olduk
        System.out.println(sayilar1);// [2, 1]

        // diger bir yontem olarak da indexOf() method'unu kullanabiliriz
        // list'de bulunan 2'yi silmek icin 2'nin index'ini bulup,onu remove() method'una yazabiliriz.
        sayilar1.remove(sayilar1.indexOf(2));
        System.out.println(sayilar1);// [1]
    }
}
