package day04_dataCasting;

public class C02_DataCasting {

    public static void main(String[] args) {

        int sayi1 = 23;
        int sayi2 = 5;
        System.out.println(sayi1 / sayi2); // ikisi de int oldugundan sonucu da int kabul eder o yüzden sonuc 4.6 degıl 4

        System.out.println(27 * 7 / 3); //58.6666 değil 58 verir data castingle alakalı değil bu

        double sayi3 = 5;
        System.out.println(sayi1 / sayi3); //4 degıl 4.6 !! iki variable'nin data turu degisik oldugunda daha kapsamlı
                                           // olani data turu olarak kabul eder..


    }
}
