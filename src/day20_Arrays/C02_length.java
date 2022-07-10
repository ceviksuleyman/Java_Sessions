package day20_Arrays;

import java.util.Arrays;

public class C02_length {

    public static void main(String[] args) {

        // iki sekilde Array olusturabilir.

        // 1- direk deger atama yaparak,
        int sayilar[]={1,2,3};

        // 2- deger atamadan sadece uzunluk verek olursa,
        String harfler[]= new String[4];

        System.out.println("sayilar array'inin uzunlugu: "+ sayilar.length );// 3
        // String length() method'unda parantez var, array'de yok.

        System.out.println("harfler array'inin uzunlugu: "+harfler.length);// 4
        System.out.println(Arrays.toString(harfler));// [null, null, null, null]

        //harfler array'inin son elementini yazdiralim,
        System.out.println(harfler[harfler.length-1]);// null

        // System.out.println(harfler[5]); // Exception runtime'da olusturuldugu icin calistirildiginda exception verir.







    }
}
