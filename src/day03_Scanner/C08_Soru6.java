package day03_Scanner;

import java.util.Scanner;

public class C08_Soru6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isminizi ve Soyisminizi Girin lutfen...");

        String isimSoyisim=scan.nextLine();

        System.out.println("isim-soyisim: " +isimSoyisim);

    }
}
