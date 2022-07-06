package day02_variableScanner;

public class C02_SwapVariables {
    public static void main(String[] args) {
        /* 1- verilen sayi1 ve sayi2 variable'lerinin degerlerini degistiren (SWAP) bir program yazınız
        Orn: sayi1=10 ve sayi2=20
       kod calıstıktan sonra
        sayi1=20 ve sayi2=10
        */
        int sayi1=10;
        int sayi2=20;
        //baslangicta sayi1=10 ve sayi2=20
        System.out.println("baslangıcta sayi1="+ sayi1+  "ve sayı2="+ sayi2);

        //ilk once bos bir variable olusturalım

        int bos;

        //sayi2 yi bos variable'a atayalım

        bos=sayi2;

        //sayi2 variable'na sayi1 degerini atayalım

        sayi2=sayi1;

        //bos variable'deki degeri sayi1 e atayalım
        sayi1=bos;
        System.out.println("sonucta sayi1=" +sayi1+  " ve sayı2="+sayi2);


    }
}
