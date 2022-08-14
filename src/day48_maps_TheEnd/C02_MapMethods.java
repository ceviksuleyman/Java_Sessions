package day48_maps_TheEnd;

import day46_maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethods {

    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("clear'dan sonra Map : " + sinifListMap); // {}

        sinifListMap = ReusableMethods.mapOlustur(); // map'i tekrar yukledik

        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key  yok")); // Derya, Deniz, Devops

        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key  yok")); // Aradiginiz key  yok

        System.out.println(sinifListMap.isEmpty()); // false

        sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108, "Suleyman, Cevik, QA"); // map,da olmadigi icin ekledi

        ReusableMethods.entryYazdir(sinifListMap);
         /*
        sinifListesiMap'e key olarak 106 yoksa, value "Mevlut, Han, Tester" ekleyin
        106 daha onceden varsa, "eski degeri degistirmek istediginizden emin misiniz?" yazdirin.

        map.putIfAbsent(key, Value) ==> key varsa ekleme yapmaz bize o key ile kayitli olan value'yu dondurur.

        ==> key daha onceden map'e eklenmemisse eklemeyi yapar ve bize null dondurur.
         */
        System.out.println(sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester")); // 106 da Taha, Deniz, JDev oldugu icin eklemedi
                                                                                  // 106 da olani bize dondurdu.

        if (sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester") == null) { // null donerse ekler

            System.out.println("Kayit basarili");

        } else {

            System.out.println("Eski degeri degistirmek istediginizden emin misiniz ? "); //Taha, Deniz, JDev oldugu icin eklemedi ve sordu

        }
        System.out.println(sinifListMap.putIfAbsent(109, "Mevlut, Han, Tester")); // null dondu ve listeye ekledi.
                                                                                  // 109 zaten olmadigi icin ekledi
        ReusableMethods.entryYazdir(sinifListMap);


        System.out.println(sinifListMap.remove(106)); // Taha, Deniz, JDev -> sildigi value'yu bize dondurur
        System.out.println(sinifListMap.remove(107, "Derya, Cem, Tester")); //true -> silerse true,silmezse false dondurur.

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.replace(105, "Erdal, Ciftci, Tester"); // Enes, Can, Tester -> 105'i Erdal, Ciftci, Tester olarak degistirdi
        sinifListMap.put(109, "Cavidan, Eken, JDev"); // Mevlut, Han, Tester -> 109'u Cavidan, Eken, JDev olarak degistirdi
        ReusableMethods.entryYazdir(sinifListMap);


        System.out.println(sinifListMap.size()); // 7

    }
}
