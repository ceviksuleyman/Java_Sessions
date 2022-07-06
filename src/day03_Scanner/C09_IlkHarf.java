package day03_Scanner;

import java.util.Scanner;

public class C09_IlkHarf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //kullanicidan ismini alıp ilk harfi buyuk olarak yazdirin
        System.out.println("Lutfen isminizi girin...");
        //java scanner class da nextChar() methodu yoktur!!!!!
        //bunun yerine String olarak ilk kelimeyi alıp onun da ilk harfini alabiliriz!!!!

        char ilkHarf=scan.next().toUpperCase().charAt(0); //javada index 0 dan başlar ilk harf sıfır

        System.out.println("ismin ilk harfi= "+ilkHarf);

    }
}
