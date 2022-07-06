package day03_Scanner;

import java.util.Scanner;

public class C07_KursKatilim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz");

        String isim=scan.nextLine();

        System.out.println("Soyisminizi giriniz...");

        String soyisim=scan.nextLine();

        System.out.println("Isminiz: " +isim);
        System.out.println("Soyisim: " +soyisim);

        System.out.println("kursa kayit isleminiz alinmiştir,tesekkurler...");

    }
}
