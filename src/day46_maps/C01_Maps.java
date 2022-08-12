package day46_maps;

import java.util.*;

public class C01_Maps {
    /*
    Maps, key-value pairs kullanir. Key'ler unique olmalidir.
    1 - HashMap synchronized degildir.Thread-safe degildir.(Buyuk ve guvenlikli uygulamalar icin kullanilmayabilir)
    2 - HashTable synchronized'dir.Thread-safe'dir ve thread'ler tarafindan ortak kullanilabilir.
    3 - TreeMap synchronized degildir.Thread-safe degildir.

    Maps, reel projelerde database yapisina en uygun Java objesidir.
    Map ile ayni ozelliklere sahip birden fazla objeyi ve ozelliklerini store edebilirsiniz.
     */

    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        sinifList.put(105, "Buse, Naz, Tester");

        System.out.println(sinifList);//{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet());// [101, 102, 103, 104, 105]

        System.out.println(sinifList.values()); // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester, Derya, Naz, Tester]

        System.out.println(sinifList.size()); // 5

        // tum ogrencilerin isim ve soyisimlerini alt alta yazdirin.


        Collection<String> tumValueColl = sinifList.values();

        String[] wArr;
        int sira = 1;
        for (String w : tumValueColl   // Buradaki w bize her bir ogrenciye ait ayni yapidaki
        ) {                            // isim, soyisim, brans bilgilerini iceren String'ler getiriyor
            //System.out.println(w);
            wArr = w.split(", ");
            System.out.println(sira + " - " + wArr[0] + " " + wArr[1]);
            sira++;
        }

        // Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek bir sinif listesi olusturun

        List<String> sinifAdSoyadList = new ArrayList<>();

        for (String w : tumValueColl
        ) {
            wArr = w.split(", ");
            sinifAdSoyadList.add(wArr[0] + " " + wArr[1]);
        }
        System.out.println(sinifAdSoyadList); // [Ali Can, Enes Cem, Taha Emre, Derya Deniz, Buse Naz]


    }
}
