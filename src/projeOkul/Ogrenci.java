package projeOkul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogrenci {

    static Map<String, String> ogrenciMap = new HashMap<>();

    static Scanner scan = new Scanner(System.in);

    public static void feykOgrenciEkle() {
        ogrenciMap.put("123456987411", "Ali, Can, 2008, 3569, 12, A");
        ogrenciMap.put("123456987412", "Veli, Yan, 2008, 3559, 12, B");
        ogrenciMap.put("123456987413", "Ayse, Can, 2007, 4569, 12, A");
        ogrenciMap.put("123456987414", "Ali, San, 2009, 1569, 11, A");
        ogrenciMap.put("123456987415", "Alp, Yan, 2009, 3769, 11, A");

    }

    public static void ogrenciMenu() throws InterruptedException {

        String tercih = "";
        do {
            System.out.println("~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                    "\n~~~~~~~~~~~  OGRENCI MENU  ~~~~~~~~~~~~" +
                    "\n\t1 - OGRENCI LISTESI YAZDIR" +
                    "\n\t2 - SOYISIMDEN OGRENCI BULMA" +
                    "\n\t3 - SINIF VE SUBE ILE OGRENCI BULMA" +
                    "\n\t4 - BILGILERINI GIREREK OGRENCI EKLEME" +
                    "\n\t5 - KIMLIK NO ILE KAYIT SILME" +
                    "\n\tA - ANA MENU" +
                    "\n\tQ _ CIKIS");

            tercih = scan.nextLine();

            switch (tercih) {
                case "1": // ogrenci listesi yazdir
                    ogrenciListeYazdir();
                    break;
                case "2": // Soyisimden Ogrenci Bulma
                    soyisimdenOgrenciBulma();
                    break;
                case "3": // Sinif ve Sube Ile Ogrenci Bulma
                    sinifVeSubeIleOgrenciBulma();
                    break;
                case "4": // Bilgilerini Girerek Ogrenci Ekleme
                    ogrenciEkle();
                    break;
                case "5":
                    tcNoIleOgrenciSilme();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    Depo.projeDurdur();
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");
            }


        } while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void tcNoIleOgrenciSilme() {

        System.out.println("Silinecek ogrenci Tc no girin : ");
        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrenciMap.get(silinecekOgrenci);

        String sonucValue = ogrenciMap.remove(silinecekOgrenci);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);

        } catch (Exception e) {

            System.out.println("Verilen Tc No ile ogrenci bulunamadi");

        }

    }

    public static void ogrenciEkle() {

        System.out.print("Tc no : ");
        String tcNo = scan.nextLine();
        System.out.print("Isim : ");
        String isim = scan.nextLine();
        System.out.print("Soyisim : ");
        String soyisim = scan.nextLine();
        System.out.print("Dogum Yili : ");
        String dogumYili = scan.nextLine();
        System.out.print("Okul No : ");
        String okulNo = scan.nextLine();
        System.out.print("Sinif : ");
        String sinif = scan.nextLine();
        System.out.print("Sube : ");
        String sube = scan.nextLine();

        String key = tcNo;
        String value = isim + ", " + soyisim + ", " + dogumYili + ", " + okulNo + ", " + sinif + ", " + sube;
        ogrenciMap.put(key, value);
    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {

        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();
        System.out.print("aradiginiz ogrencinin sinifini girin : ");
        String istenilenSinif = scan.nextLine();
        System.out.print("aradiginiz ogrencinin subesini girin : ");
        String istenilenSube = scan.nextLine();
        System.out.println("       ~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                "\n      ~~~~~~~~~~~~ OGRENCI LISTESI ~~~~~~~~~~~~" +
                "\n   TC NO      ISIM   SOYISIM   D.YILI  OKUL/NO  SINIF  SUBE");
        for (Map.Entry<String, String> w : myEntrySet
        ) {

            String wKey = w.getKey();
            String wValue = w.getValue();
            String[] wValueArr = wValue.split(", ");

            if (istenilenSinif.equalsIgnoreCase(wValueArr[4]) && istenilenSube.equalsIgnoreCase(wValueArr[5])) {

                System.out.printf("%-12s  %-6s  %-9s %-7s %-8s %-5s  %-2s \n",
                        wKey,
                        wValueArr[0], wValueArr[1], wValueArr[2],
                        wValueArr[3], wValueArr[4], wValueArr[5]);
            }
        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgrenciBulma() throws InterruptedException {

        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();
        System.out.print("aradiginiz ogrencinin soyismini girin : ");
        String istenilenSoyisim = scan.nextLine();
        System.out.println("       ~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                "\n      ~~~~~~~~~~~~ OGRENCI LISTESI ~~~~~~~~~~~~" +
                "\n   TC NO      ISIM   SOYISIM   D.YILI  OKUL/NO  SINIF  SUBE");
        for (Map.Entry<String, String> w : myEntrySet
        ) {

            String wKey = w.getKey();
            String wValue = w.getValue();
            String[] wValueArr = wValue.split(", ");

            if (istenilenSoyisim.equalsIgnoreCase(wValueArr[1])) {

                System.out.printf("%-12s  %-6s  %-9s %-7s %-8s %-5s  %-2s \n",
                        wKey,
                        wValueArr[0], wValueArr[1], wValueArr[2],
                        wValueArr[3], wValueArr[4], wValueArr[5]);

            }
        }
        Thread.sleep(5000);

    }


    public static void ogrenciListeYazdir() throws InterruptedException {

        Set<Map.Entry<String, String>> myEntrySet = ogrenciMap.entrySet();
        //System.out.println(ogrenciMap);

        System.out.println("       ~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                "\n      ~~~~~~~~~~~~ OGRENCI LISTESI ~~~~~~~~~~~~" +
                "\n   TC NO      ISIM   SOYISIM   D.YILI  OKUL/NO  SINIF  SUBE");
        for (Map.Entry<String, String> w : myEntrySet
        ) {

            String wKey = w.getKey();
            String wValue = w.getValue();
            String[] wValueArr = wValue.split(", ");
            System.out.printf("%-12s  %-6s  %-9s %-7s %-8s %-5s  %-2s \n",
                    wKey,
                    wValueArr[0], wValueArr[1], wValueArr[2],
                    wValueArr[3], wValueArr[4], wValueArr[5]);
        }
        Thread.sleep(5000);

    }

}
