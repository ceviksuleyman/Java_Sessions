package day28_staticBlock;

public class C03_PassByValue {

    public static void main(String[] args) {

        // %25 indirimli fiyati hesaplayip bize donduren method olusturun

        double satisFiyati = 100 ;

        double indirimOrani = 35 ;

        double indirilimFiyat = indirimliFiyatHesapla(satisFiyati,indirimOrani);

        System.out.println("indirimli fiyat :"+indirilimFiyat);

    }
    /* Programlama dillerinde bir method cagrildiginda orginal data'nin nasil kullanilacagi 2 sekilde belirlenebilir
    1-  Pass By Value : Primitive bir data'yi parametre olarak bir method'a gonderdigimizde Java original variable
    yerine ayni degere sahip kopya bir variable olusturur ve method icerisinde kopya variable uzerinden islem yapilir.

    2- Pass By Reference : ise method cagrildiginda, data'nin original degeri ile islem yapilir.Eger method icerisinde
    data degistirilse orginal deger de degismis olur.

    bu iki  alternative goz onune alindiginda JAVA Pass By Value ozelligini kullanmaktadir.!!!!!!!
     */

    public static double indirimliFiyatHesapla(double satisFiyati,double indirimOrani) { // burdaki isim onemli degil degeri aliyor.!

        double indirimliFiyat =satisFiyati*(1-indirimOrani/100);


        return indirimliFiyat;
    }
}
