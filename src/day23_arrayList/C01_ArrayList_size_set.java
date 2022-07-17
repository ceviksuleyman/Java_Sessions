package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ArrayList_size_set {

    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        // size() -> method'u arraylist'te kac eleman oldugunu bize int olarak dondurur.
        System.out.println("Listenin boyutu: "+sayilar1.size());// 3
        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);// [5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin yeni boyutu: "+sayilar1.size());// 8

        //------------------------------------------------------------------------------------------------------------
        // set() ->
        sayilar1.set(2,8); //eger bunu yazdirmazsak bu satirda kalir ve listenin son halini bize verir.[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println(sayilar1);// 2. index'den 2 yi sildi yerine 8 koydu // [5, 3, 8, 2, 5, 3, 2, 2]

        // 5 dondu 0.index'den silinen sayiyi bize dondurdu ve yerine 12 yazdi
        // sayilar1.set(0,12) komutunu Sout icinde direk yazarsak bize silecegi elemani geri dondurur
        System.out.println(sayilar1.set(0,12));// 5
        System.out.println(sayilar1);//[12, 3, 8, 2, 5, 3, 2, 2] tekrar yazdirdigimizda 5 yerine 12 yazdigini goruruz.
        // set() method'u istenen index'deki eski elementi silip yerine verdigimiz yeni elementi set eder.


        // Eger eski elementi silmek istemiyorsak ? add(index,deger) !!!!!!!!!!!!
        // set() method'u sildigi eski elementi de bize dondurur.

    }
}
