package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList_remove {

    public static void main(String[] args) {

        // remove() ->
        // iki sekilde kullanilir,
        // 1- silinecek objeyi yazip silmesini istersek bize boolean sonuc dondurur. true/false
        // 2- silinecek elemanin index'ini girersek bu defa hem elemani siler hem de method'u Sout icinde yazarsak,
        // bize silinen elemani dondurur !!!
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println("Urunler listesi'nin ilk durumu: "+urunler);

        // 1. durum  obje girelim
        System.out.println(urunler.remove("Ikram")); //true ve Ikram silindi
        //Olmayan bir elemani silmesini istersek ?
        System.out.println(urunler.remove("Suleyman")); //false  boyle bi urun yok dedi
        System.out.println(urunler);// [Nutella, Cekirdek, Cay]

        //--------------------------------------------------------------------------------------------------------

        // 2. durum index girelim listenin son durumu [Nutella, Cekirdek, Cay]
        System.out.println(urunler.remove(1));// Cekirdek, 1.index'deki elemani sildi ve silinen elemani dondurdu!
        System.out.println(urunler);//[Nutella, Cay]

        // Eger size()'dan buyuk bir index girersek yani olmayan index'i  ???? [Nutella, Cay]
        //System.out.println(urunler.remove(3)); RT Error  IndexOutOfBoundsException

    }
}
