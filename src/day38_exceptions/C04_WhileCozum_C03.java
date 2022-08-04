package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_WhileCozum_C03 {

    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup,o index'teki urunu yazdiran bir program hazirlayalim.
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim.
         */
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan;

        int istenenSira = 0;

        boolean kontrol = true;


        while (kontrol) {

            try {

                scan = new Scanner(System.in);
                System.out.print("Istediginiz urunun sira no girin : ");
                istenenSira = scan.nextInt();
                kontrol = false;

            } catch (InputMismatchException deneme) {

                System.out.println("Urun index'i icin bir tamsayi girmeniz gerekli");
            }
        }

        try {

            System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + (urunler.length) + " olabilir");
        }

    }
}
