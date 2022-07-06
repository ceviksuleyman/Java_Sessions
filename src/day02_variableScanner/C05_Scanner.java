package day02_variableScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //kullanıcıdan isim ve soyismini ayrı ayrı isteyip
        //girilen ismi asagidaki gibi yazdiriniz

        //girilen isim : Suleyman Cevik

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim=scan.next();
        System.out.println("lutfen soyisminizi giriniz...");
        String soyisim=scan.next();

        System.out.println("girilen isim : "+ isim + " " +soyisim);
    }
}
