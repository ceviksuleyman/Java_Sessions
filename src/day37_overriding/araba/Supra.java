package day37_overriding.araba;

public class Supra extends Toyota {

    //@Override Araba class'inda yakit method'unu private yapinca isimleri ayni ama iki farkli method oldu
    // sadece  @Override notasyonu hata verir.

    /*
    private method'lar override edilemez.
    Eger child class'da parent class'daki private method ile ayni signature'da bir method
    olusturursaniz,bu durumda overriding method OLMAZ.
     */

    //@Override
    void yakit(){
        System.out.println("Supra benzin kullanir");
    }

    @Override
    void motor() {
        /*
         @Override notasyonu Java'ya bir gorev verir.
         Java, bu notasyonla birbirine bagli olan iki method'u surekli kontrol eder.
         Eger parent class'daki overridden method'u silerseniz CTE verir.

         @Override notasyonu kullanmak mecburi degildir.
         Eger overridden method silinirse kodun CTE vermesini istersek @Override notasyonu kullanmaliyiz.
         */
    }

}
