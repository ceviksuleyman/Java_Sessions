package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {

    public static void main(String[] args) {
        /*
        Kullanicidan 4 basamakli bir sayi isteyin ,girdiği sayi 5'e bolunuyorsa son rakamini kontrol edin
        Son rakami sifir ise ekrana "5'e bolunen cift sayi" yazdirin.
        Son rakami 0 degilse " 5 e bolunen tek sayi yazdirin.
        Girdigi sayi 5 e bolunmuyorsa "Tekrar deneyin" yazdirin..
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();

        //sayinin 5 e bolunup bolunmemesi
        //sayinin son basamaginin 0 olup olmamasi

        if (sayi<1000 || sayi>9999){
            System.out.println("Luften 4 basamakli bir sayi girin");
        } else if (sayi%5==0){                       //sayi 4 basamakli ve 5 e tam bolunebiliyor
             if (sayi%10==0){
                 System.out.println("5 e bolunen cift sayi");
             }else {
                 System.out.println("5 e bolunen tek sayi");
             }


        }else {                             //sayi 4 basamakli ama 5 e bolunemiyor
            System.out.println("Tekrar deneyin");
        }


    }
}
