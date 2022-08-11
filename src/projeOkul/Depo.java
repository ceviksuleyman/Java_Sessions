package projeOkul;

import java.util.Scanner;

public class Depo {

    static Scanner scan = new Scanner(System.in);

    public static void anaMenu() throws InterruptedException {

        String tercih = "";
        do {

            System.out.println("~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~" +
                    "\n~~~~~~~~~~~  ANA MENU  ~~~~~~~~~~~~" +
                    "\n\t1 - OKUL BILGILERINI GORUNTULE" +
                    "\n\t2 - OGRETMEN MENU" +
                    "\n\t3 - OGRENCI MENU" +
                    "\n\tQ - CIKIS");

            System.out.println("Lutfen Menuden Tercihinizi Yapiniz");
            tercih = scan.nextLine();

            switch (tercih) {

                case "1": // Okul bilgileri
                    Depo.okulBilgileriniYazdir();
                    break;
                case "2": // Ogretmen menu
                    Ogretmen.ogretmenMenu();
                    break;
                case "3": // Ogrenci menu
                    Ogrenci.ogrenciMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }

        } while (!tercih.equalsIgnoreCase("Q")); // Q basilmadigi surece menuden cikmayacak

        Depo.projeDurdur(); // Projeden cikis
    }


    public static void okulBilgileriniYazdir() throws InterruptedException {

        System.out.println("~~~~~~~~~~ YILDIZ KOLEJI ~~~~~~~~~~" +
                "\n\tAdres   : " + Okul.adres +
                "\n\tTelefon : " + Okul.telefon);

        Thread.sleep(5000);// Okul bilgileri goruntulemede 5 saniye beklesin
    }

    public static void projeDurdur() { // projeden cikis method

        System.out.println("Okul Menusunden Ciktiniz.");
        System.exit(0);
    }
}
