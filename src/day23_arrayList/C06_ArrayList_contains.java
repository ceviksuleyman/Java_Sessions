package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList_contains {

    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        // contains() =>
        // method'u bir objeyi list'de varmi diye kontrol eder boolean sonuc dondurur. true/false
        // kullandiktan sonra list'de bir degisiklik olmaz sadece bilgi dondurur.
        System.out.println(urunler.contains("Nutella"));// true
        // list'te olmayan bir urunu sorarsam? Hobby
        System.out.println(urunler.contains("Hobby")); // false


        // containsAll() =>
        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Nutella");
        urunler2.add("Ikram");

        //urunler2'deki butun var olan  elemanlar urunler'de varmi diye kontrol etti
        System.out.println(urunler.containsAll(urunler2));// true

        // peki urunler2'ye yeni eleman eklersek ?
        urunler2.add("Hobby");
        // Nutella ve Ikram urunler lis'tinde fakat Hobby urunler list'inde olmadigi icin bize false doner.
        // Hepsini iceriyormu diye kontrol etti
        System.out.println(urunler.containsAll(urunler2));// false

    }
}
