package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList_set {

    public static void main(String[] args) {
        // Elimizde urunlerin bulundugu bir liste var,urun listesindeki istenen siradaki urunu yeni urunle degistirip
        // eski urunu var olan eski urunler listesine ekleyelim.

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        System.out.println("Urunler listesi'nin ilk durumu: "+urunler);

        List<String> eskiUrunler = new ArrayList<>();
        //urunler list'deki "Ikram'in yerine "Biskrem" koyalim,Ikram'i da eski urunler listesine koyalim..

        String yeniUrun = "Biskrem";
        String silinecekUrun = "Ikram";

        int temp = urunler.indexOf(silinecekUrun);// silinecek urunun index'ini ogrenmek icin bir variable olusturduk
        System.out.println(urunler.indexOf(silinecekUrun));// 1 = silecegimiz urunun index'i
        // listeyi bilmesek de silinecek urunun index'ini biliyoruz,ve yeni urunumuzu bu index'e set() ile koyabiliriz.

        String silinenUrun = (urunler.set(temp,yeniUrun));//silinecek urunu silicek yeni urunu ekleyecek ve sildigi urunu
        //silinen urun string'ine getirecek.
        eskiUrunler.add(silinenUrun); // sildigimiz urunu de eski urunler list'ine ekledik
        System.out.println(silinenUrun+" yerine "+yeniUrun+" ekledik "+urunler);
        System.out.println("eski urunler listesi: "+eskiUrunler);// [Ikram]

        //------------------------------------------------------------------------------------------------------------
        yeniUrun = "Kahve";
        silinecekUrun = "Cay";

        temp = urunler.indexOf(silinecekUrun);
        System.out.println(urunler.indexOf(silinecekUrun));//3 = silinecek urunun index'i

        silinenUrun = (urunler.set(temp,yeniUrun));

        eskiUrunler.add(silinenUrun);
        System.out.println(silinenUrun+" yerine "+yeniUrun+" ekledik "+urunler);//[Nutella, Biskrem, Cekirdek, Kahve]
        System.out.println("eski urunler listesi: "+eskiUrunler);// [Ikram, Cay]

        //------------------------------------------------------------------------------------------------------------
        yeniUrun = "Findik";
        silinecekUrun = "Cekirdek";

        temp = urunler.indexOf(silinecekUrun);
        System.out.println(urunler.indexOf(silinecekUrun));//2 = silinecek urunun index'i

        silinenUrun = (urunler.set(temp,yeniUrun));

        eskiUrunler.add(silinenUrun);
        System.out.println(silinenUrun+" yerine "+yeniUrun+" ekledik "+urunler);//[Nutella, Biskrem, Findik, Kahve]
        System.out.println("eski urunler listesi: "+eskiUrunler);//  [Ikram, Cay, Cekirdek]

    }
}
