package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C01_OncekiGununDevami {

    public static void main(String[] args) {

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();

        // ogrenci listesini isim soyisim olarak yazdirin.
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);

        // kac farkli brans varsa bransIsmi : branstakiOgrenciSayisi seklinde method olusturun

        ReusableMethods.bransOgrenciSayisiYazdir(sinifListMap);

    }
}
