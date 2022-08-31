package projeOkul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {

    static Map<String, String> ogretmenlerMap = new HashMap<>(); // map

    static Scanner scan = new Scanner(System.in);

    public static void feykOgretmenEkle() {

        ogretmenlerMap.put("12312312311", "Murtaza, Can, 1980, Matematik");
        ogretmenlerMap.put("12312312321", "Mahmut, Tok, 1982, Fizik");
        ogretmenlerMap.put("12343545671", "Veli, Kan, 1994, Kimya");
        ogretmenlerMap.put("12312345671", "Kamil, Can, 1985, Biyoloji");
        ogretmenlerMap.put("15232342331", "Ayse, Gul, 1983, Biyoloji");
        ogretmenlerMap.put("14232123232", "Suleyman, Cevik, 1993, Java");

    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih;
        do {

            System.out.println("~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                    "\n~~~~~~~~~~~  OGRETMEN MENU  ~~~~~~~~~~~~" +
                    "\n\t1 - OGRETMEN LISTESI YAZDIR" +
                    "\n\t2 - SOYISIMDEN OGRETMEN BULMA" +
                    "\n\t3 - BRANSTAN OGRETMEN BULMA" +
                    "\n\t4 - BILGILERINI GIREREK OGRETMEN EKLEME" +
                    "\n\t5 - KIMLIK NO ILE KAYIT SILME" +
                    "\n\tA - ANA MENU" +
                    "\n\tQ _ CIKIS");

            tercih = scan.nextLine();

            switch (tercih) {
                case "1": // ogretmenler listesini yazdir
                    ogretmenListesiYazdirMethodu();
                    break;
                case "2": // soyisimden ogretmen bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3": // branstan ogretmen bulma
                    branstanOgretmenBulma();
                    break;
                case "4": // Bilgilerini girerek ogretmen ekleme
                    ogretmenEkleme();
                    break;
                case "5":  // tc no ile kayit silme
                    tcNoIleOgretmenSil();
                    break;
                case "a":
                case "A":
                    Depo.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lutfen Gecerli Tercih Giriniz");
            }


        } while (!tercih.equalsIgnoreCase("Q"));
        Depo.projeDurdur();

    }

    public static void tcNoIleOgretmenSil() throws InterruptedException {

        System.out.print("Silinecek ogretmen Tc no girin : ");
        String silinecekOgretmen = scan.nextLine();

        String silinecekValue = ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);

        } catch (Exception e) {

            System.out.println("Verilen Tc No ile Ogretmen bulunamadi");

        }
    }

    public static void ogretmenEkleme() { // ogretmen ekleme

        System.out.print("Tc no : ");
        String tcNo = scan.nextLine();
        System.out.print("isim : ");
        String isim = scan.nextLine();
        System.out.print("soyisim : ");
        String soyisim = scan.nextLine();
        System.out.print("Dogum yili : ");
        String dYili = scan.nextLine();
        System.out.print("Brans : ");
        String brans = scan.nextLine();

        String eklenecekValue = isim + ", " + soyisim + ", " + dYili + ", " + brans;
        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() throws InterruptedException {// branstan ogretmen bul

        System.out.print("Aradiginiz Ogretmenin Bransini Giriniz : ");
        String istenenBrans = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                "\n~~~~~~~~~~~ BRANS ILE OGRETMEN ARAMA ~~~~~~~~~~~~" +
                "\n   TCNO      ISIM     SOYISIM    D.YILI  BRANS");

        for (Map.Entry<String, String> w : ogretmenEntrySet
        ) {
            String wKey = w.getKey();
            String wValue = w.getValue();

            String[] wValueArr = wValue.split(", ");// Ogretmen bilgilerini array'e atadik
            if (istenenBrans.equalsIgnoreCase(wValueArr[3])) {
                System.out.printf("%11s  %-8s   %-8s  %4s   %-6s \n",
                        wKey,
                        wValueArr[0],
                        wValueArr[1],
                        wValueArr[2],
                        wValueArr[3]);

            }
        }
        Thread.sleep(5000);

    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException { //soyisimden ogretmen bul

        System.out.print("Aradiginiz Ogretmenin Soyismini Giriniz : ");
        String istenenSoyisim = scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                "\n~~~~~~~~~~~ SOYISIM ILE OGRETMEN ARAMA ~~~~~~~~~~~~" +
                "\n    TCNO      ISIM      SOYISIM   D.YILI  BRANS");

        for (Map.Entry<String, String> w : ogretmenEntrySet
        ) {
            String wKey = w.getKey();
            String wValue = w.getValue();

            String[] wValueArr = wValue.split(", ");// Ogretmen bilgilerini array'e atadik
            if (istenenSoyisim.equalsIgnoreCase(wValueArr[1])) {
                System.out.printf("%12s  %-9s   %-9s  %5s   %-7s \n",
                        wKey,
                        wValueArr[0],
                        wValueArr[1],
                        wValueArr[2],
                        wValueArr[3]);

            }
        }
        Thread.sleep(5000);
    }


    public static void ogretmenListesiYazdirMethodu() throws InterruptedException { // ogretmenlistesi method

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();
        System.out.println("~~~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~~~" +
                "\n~~~~~~~~~~~  OGRETMEN LISTESI  ~~~~~~~~~~~~" +
                "\n   TCNO      ISIM     SOYISIM    D.YILI  BRANS");

        for (Map.Entry<String, String> w : ogretmenEntrySet
        ) {
            String wKey = w.getKey();
            String wValue = w.getValue();

            String[] wValueArr = wValue.split(", ");// Ogretmen bilgilerini array'e atadik
            System.out.printf("%11s  %-8s  %-8s   %4s   %-6s \n",
                    wKey,
                    wValueArr[0],
                    wValueArr[1],
                    wValueArr[2],
                    wValueArr[3]);
        }
        Thread.sleep(5000);

    }
}
