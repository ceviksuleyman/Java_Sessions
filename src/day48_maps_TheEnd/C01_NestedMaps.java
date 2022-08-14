package day48_maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
     /*
     Eger bir element ile ilgili tutacagimiz bilgiler coksa veya kompleks ise
     bu defa ic ice map kullanmayi tercih edebiliriz.

     Nested map kullandigimizda daha fazla datayi daha duzenli olarak tutma imkanimiz olur,
     ancak bilgiye ulasmak ve manipule etmek zorlasacaktir.

     Ornek olarak dun olusturdugumuz map'imizi map'larden olusan bir map olarak olusturalim.

        sinifMap.put(no=102, isim=Enes, soyisim=Cem, brans=Tester);
        sinifMap.put(103, "Taha, Emre, JDev");
        sinifMap.put(104, "Derya, Deniz, Devops");
     */

    public static void main(String[] args) {

        Map<String, String> ogr101 = new HashMap<>();
        ogr101.put("isim", "Enes");
        ogr101.put("soyisim", "Cem");
        ogr101.put("brans", "Tester");

        Map<String, String> ogr102 = new HashMap<>();
        ogr102.put("isim", "Taha");
        ogr102.put("soyisim", "Emre");
        ogr102.put("brans", "JDev");

        Map<String, String> ogr103 = new HashMap<>();
        ogr103.put("isim", "Derya");
        ogr103.put("soyisim", "Deniz");
        ogr103.put("brans", "Devops");

        Map<Integer, Map<String, String>> ogrenciNestedMap = new HashMap<>();
        ogrenciNestedMap.put(101, ogr101);
        ogrenciNestedMap.put(102, ogr102);
        ogrenciNestedMap.put(103, ogr103);

        System.out.println("ogrenciNestedMap = " + ogrenciNestedMap);


        Set<Map.Entry<Integer, Map<String, String>>> ogrenciNestedEntrySeti = ogrenciNestedMap.entrySet();

        for (Map.Entry<Integer, Map<String, String>> w : ogrenciNestedEntrySeti) {

            System.out.println(w);
        }

        // 102 nolu kisinin ismini yazdirin

        System.out.println(ogrenciNestedMap.get(102));  // {soyisim=Emre, brans=JDev, isim=Taha}

        System.out.println(ogrenciNestedMap.get(102).get("isim"));  // Taha

        System.out.println(ogrenciNestedMap.get(103).get("brans")); // Devops

    }
}
