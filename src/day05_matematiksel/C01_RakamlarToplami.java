package day05_matematiksel;

import java.util.Scanner;

public class C01_RakamlarToplami {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Kullanicidan 4 basamakli pozititif bir sayi alın ve rakamlar toplamini bulup yazdirin..

        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz...");
        int sayi=scan.nextInt();  // 5267

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi=sayi;

        //suanda sayi 5267 bb=0 rt=0

        birlerBasamagi=sayi%10;  //7
        rakamlarToplami+=birlerBasamagi;
        sayi/=10;

        //suanda sayı 526 bb=7 rt=7

        birlerBasamagi=sayi%10;  //6
        rakamlarToplami+=birlerBasamagi;//7+6=13
        sayi/=10;

        //suanda sayi 52  bb=6 rt=13

        birlerBasamagi=sayi%10;  //2
        rakamlarToplami+=birlerBasamagi; //13+2=15
        sayi/=10; //5

        //suanda sayi 5 bb=2 rt=15

        birlerBasamagi=sayi%10;//55
        rakamlarToplami+=birlerBasamagi; //15+5=20
        sayi/=10;//0.5 int oldugu için 0 alır

       // suanda sayı 0 bb=5 rt=20
        System.out.println(girilenSayi+" sayisinin rakamlar toplami= "+rakamlarToplami);









    }
}
