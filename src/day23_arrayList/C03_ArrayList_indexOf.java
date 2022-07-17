package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_ArrayList_indexOf {

    public static void main(String[] args) {


        // indexOf() ->
        // method'u bize sadece  verilen elemanin index'ini bize dondurur,kullandiktan once veya sonra
        // list'de herhangi bir degisiklik yapmaz !

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println("Urunler listesi'nin ilk durumu: "+urunler);

        System.out.println(urunler.indexOf("Ikram"));// 1 indexOf() bize sadece bilgi dondurur bi degisiklik yapmaz
        System.out.println(urunler);

        //---------------------------------------------------------------------------------------------------------
        // lastIndexOf() ->
        // indexOf() method'u verilen elemani aramaya 0. index'ten basliyordu,
        // lastIndexOf() method'u aramaya son index'ten baslar,eger aranan eleman zaten 1 tane ise yine ayni index'i verir,
        // ancak aranan eleman 1'den fazlaysa son index'e en yakin olan elemanin index'ini verir.

        urunler.add("Ikram"); // urunlere bir tane daha Ikram ekledik
        System.out.println(urunler.lastIndexOf("Ikram"));// 4  ve bize sondaki Ikramin index'ini dondurdu !

        //  -- Olmayan bir urunun index'ini ararsak ??
        //  aranan eleman eger list'te yoksa indexOf() da lastIndexOf() method'u da bize -1 dondurur !!!!!!!
        System.out.println(urunler.indexOf("Hobby"));// -1
        System.out.println(urunler.lastIndexOf("Hobby"));// -1



    }
}
