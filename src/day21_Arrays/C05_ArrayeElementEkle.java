package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkle {

    public static void main(String[] args) {
        //  Verilen bir array'a yeni bir element ekleyen method olusturun

        String [] sinifListesi = {"Suleyman","Babalar","JavaBey"};
        String eklenecekIsim = "Murtaza Mahmut";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));
    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {

        //eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum
        String [] yeniSinifListesi = new String[sinifListesi.length+1];

        for (int i = 0; i < sinifListesi.length ; i++) {
            //oncelikle eski listedeki tum elemanlari yeni listeye tasidim
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //son index'e ise eklenecek ismi atadim.
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;

        return yeniSinifListesi;
    }
}
