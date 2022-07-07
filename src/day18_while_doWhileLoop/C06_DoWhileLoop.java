package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {

    public static void main(String[] args) {
        /*S4
         Kullanicidan toplamak uzere pozitif tamsayilar isteyin,islemi bitirmek icin sifira basmasini soyleyin.
         Kullanici yanlislikla negatif sayi girerse o sayiyi dikkate almayin ve"Negatif sayi giremezsiniz" yazdirip
         basa donun kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,yanlislikla kac tane negatif sayi
         girdigini ve girdigi pozitif sayilarin toplamini yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;   //while loop ile yapsaydik degisken 0 yaptigimizdan program calismazdi .cunku ilk kontrol eder.
        int pozitifSayiAdedi=0;
        int negatifSayiAdedi=0;
        int pozitifSayiToplam=0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi girin..");
            sayi= scan.nextInt();

            if (sayi > 0) {
                pozitifSayiToplam+=sayi;
                pozitifSayiAdedi++;

            } else if (sayi < 0) {
                negatifSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz.");
            }

        }while (sayi!=0);

        System.out.println(pozitifSayiAdedi+" adet pozitif sayi girdiniz, toplamlari: "+pozitifSayiToplam);
        System.out.println(negatifSayiAdedi+" adet negatif sayi girdiniz ancak toplama dahil edilmedi.");


    }
}
