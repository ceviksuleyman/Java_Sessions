package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_ArrayList_equals {

    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> urunler2 = new ArrayList<>();
        urunler2.add("Ikram");
        urunler2.add("Nutella");
        urunler2.add("Cay");
        urunler2.add("Cekirdek");


        // equals()=>
        // method'u iki list'teki ayni index'teki elemanlarin ayni olup olmadigina bakar,boolean sonuc doner,
        // ayni index'teki tum elemanlar ayni ise true degilse false dondurur.

        System.out.println(urunler.equals(urunler2)); // false  urunler ayni fakat index'leri farkli

        Collections.sort(urunler);  // iki listeyi de siraladiktan sonra
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2));// true

    }
}
