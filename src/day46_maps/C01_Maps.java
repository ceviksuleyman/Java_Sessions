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
      /*
    Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

    HashMap =>

    HasMap key-value yapisini kullanir. Key ve valueprogramci tarafindan yazilir.
    Key ve value'da null degeri kullanilabilir.
    Key'de 1'den fazla null degeri kullanilirsa Java son kullanilan null'i kabul eder.
    Value'da 1'den fazla null degeri kullanilabilir.
    HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
    HashMap'ler ekrana yazdirirken rastgele siralama yapar
    HasMap map'ler arasinda en hizlisidir.
    HashMap'ler "thread safe" degildir.

    HashTable =>

    HashMap ile hemen hemen aynidir
    HashTable console'a yazdirildiginda HashMap gibi rastgele siralamada yazdirilir
    Farklari:
    1) HashTable key ve value'larda null'a musaade etmez.
    2) HashTable thread safe'dir.Bir kac isi ayni anda yapabilir.
    3) HashTable daha yavastir.

    TreeMap =>

    1) TreeMap key'lerde null kullanmaya musaade etmez ama value'larda istedigimiz kadar null kullanmaya musaade eder
    2) TreeMap elemanlarini console'a yazdirmak istediginizde key'ler natural order'a gore siralanir.
    3) TreeMap en yavaslaridir
     */

    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        sinifList.put(105, "Buse, Naz, Tester");

        System.out.println(sinifList);//{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester, 105=Buse, Naz, Tester}

        System.out.println(sinifList.keySet());// [101, 102, 103, 104, 105]

        System.out.println(sinifList.values()); // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester, Buse, Naz, Tester]

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
