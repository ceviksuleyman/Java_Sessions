package day23_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_ArrayList_sort {

    public static void main(String[] args) {


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println("list'in ilk durumu : "+urunler);

        Collections.sort(urunler); // bize bisey dondurmez list'i siralar

        // List ile gelen sort() method'unda siralama ozelligini girmek gerekiyor,bunun yerine
        // Collections Class'indan sort method'unu kullaniyoruz bu method list'imizi natural order'a gore siralar

        System.out.println("siralamadan sonra list : "+urunler);
    }
}
