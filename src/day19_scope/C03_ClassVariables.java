package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farkli bir class'da calisirken herhangi bir class adini yazip .'ya basarsak adini yazdigimiz class'daki
        tum STATIC class uyelerini gorebilir ve kullanabiliriz.
         */
        C02_StaticVariables.staticMethod();     //10 runtime calistigi icin diger class'daki degisikliklere bakmaz
                                                // ve C02'deki ilk atanan degeri alir
        System.out.println(C02_StaticVariables.staticSayi); //10

        /*
          Class level variables'a deger atayip atamamak bize kalmistir,istersek deger atamasi yapariz istemezsek deger
        atamayiz.

          Eger deger atamissak Java atadigimiz o degeri kabul eder,deger atamazsak o zaman Java bu variables'a default
        bir deger atamasi yapar.
          -int --> 0
          -String --> null
          boolean --> false
          char -->''(hiclik)
         */
        System.out.println(C02_StaticVariables.degersizStaticVariable); //0


        //======= Baska Class'daki instance variable'lara nasil ulasiriz ?====OBJE OLUSTURARAK ! =====

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        /*
        Bu method icinde static sayi diger classdaki islemden dolayi yazdirdiktan sonra 20 oldu tekrar yazdirirsak
        asagidaki gibi sonraki atanan degeri aldi.
         */
        obje1.staticOlmayanMethod(); //20
        System.out.println(C02_StaticVariables.staticSayi); //20


        System.out.println(obje1.isim); // Cevik

        System.out.println(obje1.degersizInstanceVariable);// 0

        /*
        Farkli bir class'dan  C02 class'indan method ve variable'lari kullandigimda C02 class'inin tamami degil
        sadece benim cagirdigim class uyeleri calisir
         */


    }
}
