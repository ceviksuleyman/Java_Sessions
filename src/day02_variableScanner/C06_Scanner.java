package day02_variableScanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        //Scanner isleminde String icin 2 method vardır
        //scan.next dedigimizde sadece bir kelime alır (ilk space'e kadar)
        //eger kullanicidan daha fazla gelme ihtimali varsa
        //scan.nextLine() kullanmalıyız

        //kullanıcıdan isim ve soyismini ayrı ayrı isteyip
        //girilen ismi asagidaki gibi yazdiriniz

        //girilen isim : Suleyman Cevik

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz...");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz...");
        String soyisim=scan.nextLine();

        System.out.println("girilen isim : "+ isim + " " +soyisim);
    }
}
