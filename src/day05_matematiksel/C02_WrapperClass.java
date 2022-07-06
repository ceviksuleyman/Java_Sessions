package day05_matematiksel;

public class C02_WrapperClass {

    public static void main(String[] args) {

        String str=" Java Cok Guzel ";
        str.toUpperCase();
        System.out.println(str);

        int sayi=10;
        //primitive data turlerinin yaninda method'lar olmaz
        //java bazi method'lari kullanabilmemiz icin
        //her bir primitive data turu icin bir wrapper class olusturulmustur..
        // Wrapper -> sarmalayici

        Integer sayi2=10;
        sayi2.byteValue();

    }
}
