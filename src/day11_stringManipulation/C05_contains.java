package day11_stringManipulation;

import java.util.Locale;

public class C05_contains {

    public static void main(String[] args) {

        /*
         Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
         “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
         iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */
        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();
        //requirements'de buyuk-kucuk harf hassasiyeti hakkinda birsey soylenmemis
        //ikinci olarak da her iki kelimeyi de icerme durumu aciklanmamis
        //bu durumda gorevi bize kim verdiyse ona sormak lazim

        //ek requiements: ikisini de iceriyorsa "karar ver buyuk mu yazdirayim, kucuk mu?"  case sensitive olmasin

        if (cumle.contains("kucuk")&&cumle.contains("buyuk")){
            System.out.println("karar ver buyuk mu yazdirayim, kucuk mu?");


        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());


        }else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());


        }else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }



    }
}
