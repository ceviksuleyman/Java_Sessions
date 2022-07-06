package day03_Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {
        //Bir tamsayi, bir de char degisken olusturun ve bunların toplamını yazın..

        int sayi= 10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf); //10a değil 107 oldu cunku char degıskenler matematıksel ısleme gırdıgınde Ascii
                                       // degerini alır a=97
        System.out.println(sayi-harf);
        System.out.println(sayi*harf);

        System.out.println(str+harf);  //banana  neden? char degıskenler Strıng degıskenın  oldugu yerde ascii degerini
                                       // değil assign edilen degerini alır 'a'=a
        System.out.println(harf+2); // 99 bu atama java tarafından kabul edilir değildir !!!!!
        System.out.println(""+sayi+harf); //10a   string ifade dahil oldugunda  Ascii degerini almaz!!!
        char b='b';
        System.out.println(harf+b); //195 iki char ifadesinin de asci değerini alıyor matematiksel ifadeden dolayı
        System.out.println(harf+" "+b); // a b seklınde assign edilen degeri alır " " String dahil ettigimiz icin

    }
}
