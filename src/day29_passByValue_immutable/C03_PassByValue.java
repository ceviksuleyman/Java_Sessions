package day29_passByValue_immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {

    public static void main(String[] args) {
        /*
        Bir list olusturalim, iki ayri method'dan birinde sadece elemanlari degistirelim  digerinde yeni bir List atayip
        ayni sayida eleman ekleyelim ve her iki method'dan sonra  kendi list'imizi main method icerisinde kontrol edelim.
         */

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");

        System.out.println("ilk basta list : "+list);// [Ali, Veli, Can]

        elemanlariDegistir(list);// [Oguz, Murat, Fatih]

        System.out.println("elemanDegistir method'undan sonra main'den list'imiz : "+list);// [Oguz, Murat, Fatih]

        listDegistir(list);//  [Nutella, Cay, Cokokrem]

        System.out.println("listDegistir method'undan sonra main'den list'imiz : "+list);// [Oguz, Murat, Fatih]
    }

    /*
    elemanlari degistirdigimiz de kalici olarak degisiklik oldu
    list'i degistirdigimiz de eski elemanlari olan list ve yeni elemanlari olan list olustu.
     */
    private static void listDegistir(List<String> list) {

        list = new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("listDegistir method'undan list : "+list);
    }

    private static void elemanlariDegistir(List<String> list) {

        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");
        System.out.println("elemanDegistir method'undan list : "+list);
    }
}
