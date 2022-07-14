package day21_Arrays;

import java.util.Arrays;

public class C01_ArraysMaxSayiyiBul {

    public static void main(String[] args) {
        //Verilen bir int array'daki en buyuk sayiyi yazdiran bir method olusturun.

        int[] sayilar = {1,5,7,9,5,8,4,2};
        maxSayiyiYazdir(sayilar);

        //ikinci yol
        Arrays.sort(sayilar);//buyukten kucuge dogru siralayip son index'deki en buyuk sayiyi yazdirdik.
        System.out.println("Array'daki en buyuk sayi: "+sayilar[sayilar.length-1]);// 9
        System.out.println("Array'daki en kucuk sayi: "+sayilar[0]); // 1

    }
    private static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi = sayilar[0];   // ilk sayiyi buraya atadik bir deger olarak
        for (int i = 1; i <sayilar.length ; i++) {

            if (sayilar[i] > maxSayi) {
                maxSayi=sayilar[i];
            }
        }
        System.out.println("Array'daki en buyuk sayi: "+maxSayi);// 9

    }

}
