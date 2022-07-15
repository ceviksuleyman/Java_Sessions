package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        //kullanicidan bir sayi alin sayi pozitifse "sayi pozitif "
        //negatifse sayinin karesini yazdirin...

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi girin");
        double sayi= scan.nextDouble();

        //Eger ternary icindeki sonuclar farkli data turunde ise atama yapamayiz sadece yazdirabiliriz
        //double sonuc= sayi>0 ? "sayi pozitif":(sayi*sayi);

        System.out.println(sayi>0 ? "sayi pozitif" :(sayi*sayi));


    }
}
