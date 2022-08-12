package day46_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReusableMethods {


    public static Map<Integer, String> mapOlustur() {

        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Buse, Naz, Tester");

        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {

        int sira = 1;
        for (String w : ogrenciMap.values()
        ) {
            String[] wArr = w.split(", ");
            System.out.println(sira + " - Ad Soyad : " + wArr[0] + " " + wArr[1] + " / Brans : " + wArr[2]);
            sira++;
        }


    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {

        List<String> methodList = new ArrayList<>();

        for (String w : ogrenciMap.values()
        ) {
            String[] wArr = w.split(", ");

            methodList.add(wArr[0] + " " + wArr[1]);

        }
        return methodList;
    }

}
