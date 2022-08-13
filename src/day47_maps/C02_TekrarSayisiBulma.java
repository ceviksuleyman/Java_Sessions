package day47_maps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C02_TekrarSayisiBulma {

    public static void main(String[] args) {

        // Verilen bir String'deki kullanilan harfleri ve kullanilan harflerin tekrar
        // sayisini H = 20 seklinde yazdirin

        String str = "Heeeeellllooooo Woooorrrrllllllddddd";

        String[] harflerArr = str.replaceAll("\\W", "").split("");

        System.out.println(Arrays.toString(harflerArr));
        // [H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]
        // H=1 e=5 l=10...

        // Harfleri key, kullanim adedini value yaparak bir map olusturalim

        Map<String, Integer> harfTekrarSayisiMap = new TreeMap<>();

        Integer harfTekrarSayisi;

        for (String w : harflerArr) {

            if (!harfTekrarSayisiMap.containsKey(w)) {

                harfTekrarSayisiMap.put(w, 1); // her farkli harfi alip 1 yazicak

            } else {
                harfTekrarSayisi = harfTekrarSayisiMap.get(w); // harfin kac defa kullanildigini getiricek
                harfTekrarSayisiMap.put(w, ++harfTekrarSayisi);
            }
        }

        System.out.println("harfTekrarSayisiMap = " + harfTekrarSayisiMap); // {H=1, W=1, d=5, e=5, l=10, o=9, r=4}

    }
}
