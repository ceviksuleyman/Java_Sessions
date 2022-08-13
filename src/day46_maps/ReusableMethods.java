package day46_maps;

import java.util.*;

public class ReusableMethods {


    public static Map<Integer, String> mapOlustur() {  //method 1

        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, JDev");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, JDev");
        sinifMap.put(107, "Derya, Cem, Tester");

        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) { // method 2

        int sira = 1;
        //for (String w : ogrenciMap.values()) {System.out.println(sira + "-" + w);sira++;}
        for (String w : ogrenciMap.values()
        ) {
            String[] wArr = w.split(", ");
            System.out.println(sira + " - Ad Soyad : " + wArr[0] + " " + wArr[1] + " / Brans : " + wArr[2]);
            sira++;
        }
    }

    public static List<String> isimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) { // method 3

        List<String> methodList = new ArrayList<>();

        for (String w : ogrenciMap.values()
        ) {
            String[] wArr = w.split(", ");

            methodList.add(wArr[0] + " " + wArr[1]);

        }
        return methodList;
    }


    public static void bransOgrenciSayisiYazdir(Map<Integer, String> sinifListMap) { // method 4
        // brans = bransdaki ogrenci sayisi

        Map<String, Integer> bransOgrSayiMap = new TreeMap<>();

        Collection<String> valuesCollections = sinifListMap.values(); // once collection'a aldik

        String[] valueArr; // collection'dan String seklinde gelecek value'u almak icin Array olusturduk
        String brans;
        Integer bransdakiOgrSayisi;

        for (String w : valuesCollections) {

            valueArr = w.split(", ");
            brans = valueArr[2];

            // bransin bransOgrSayiMap'inde key olarak daha onceden eklenip eklenmedigini kontrol etmeliyiz

            if (!bransOgrSayiMap.containsKey(brans)) {

                bransOgrSayiMap.put(brans, 1);
            } else {

                bransdakiOgrSayisi = bransOgrSayiMap.get(brans);
                bransOgrSayiMap.put(brans, ++bransdakiOgrSayisi);
            }
        }


        System.out.println(bransOgrSayiMap);
    }
}
