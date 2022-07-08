package day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Cevik";
    static int degersizStaticVariable;
    int degersizInstanceVariable;
    /*
    class level'deki variable'lara deger atamasak da Java kabul ediyor.
     */
    /*
    static variable'lar class'a baglidir. en son atanan deger  kalici olur kodu sonuna kadar takip etmek gerekir
     */

    public static void main(String[] args) {
        /*
        Bir variable static olusturulduysa, objeler icin DEGIL  Class icin GECERLIDIR.
         */
        System.out.println(staticSayi); //10
        staticMethod(); //10   static sayinin en son degerini alir
        staticSayi=15;
        System.out.println(staticSayi); //15

        C02_StaticVariables obje1 = new C02_StaticVariables();//static olmayan method'a ulasmak icin obje olusturduk.
        obje1.staticOlmayanMethod();  // 15  en son degerini aldi

        System.out.println(staticSayi);// 20
        /*
        * instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren istenen satira kadar kodu
        takip etmeliyiz

        * static variable'da ise class'in en basindan baslayarak istenen satira kadar kodu takip edip static variable'in
        son degerini bulmamiz gerekir.
         */

    }

    public  static void staticMethod(){

        System.out.println(staticSayi);

    }

    public void staticOlmayanMethod(){

        System.out.println(staticSayi); //static bir variable oldugundan heryerden ulasilabilir!!!
        staticSayi=20;
        /*
        static variables class icerisinden heryerden ulasilabilir.Static olsun veya  olmasin butun methodlar
        static variables'i gorebilir ve degistirebilirler.

        Farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak class'in basindan itibaren
        kodun calismasini takip etmeliyiz.
        Method ne zaman cagirilirsa o anki static variable degerini method'da kullanabiliriz.
         */


    }
}
