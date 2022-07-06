package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

         /*
        Kullanicidan iki sayi alin,girilen sayilar ve aralarindaki tum sayilari toplayip
        sonucu yazdiran bir method yazin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak girin..");
        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();

        aralariTopla(baslangic,bitis);
    }

    public static void aralariTopla(int baslangic, int bitis) {
        int toplam=0;

        if (baslangic<=bitis){

            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;
            }
        }else {

            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;
            }
        }

        System.out.println("girilen sayilar ve aradaki sayilarin toplami: "+toplam);
    }
}
