package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {

    public static void main(String[] args) {

        //C05 deki method'u kullanarak array'e eleman ekleyelim

        String[] takimListesi = {"Suleyman","Osman"};

        String eklenecekIsim = "Murtaza";

        takimListesi=C05_ArrayeElementEkle.elemanEkle(takimListesi,eklenecekIsim);// kullandigimiz methodu
                   //takimListesine atayarak eklenecekIsim'i de ekledik.
        System.out.println(Arrays.toString(takimListesi));


        //System.out.println(Arrays.toString(C05_ArrayeElementEkle.elemanEkle(takimListesi,eklenecekIsim))); bu sekilde
        // ekleyip direk yazdiradabiliriz.

    }
}
