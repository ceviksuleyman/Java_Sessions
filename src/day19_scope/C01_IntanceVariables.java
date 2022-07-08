package day19_scope;

public class C01_IntanceVariables {
   /*
   Class icerisinde heryerden kullanmak istediginiz variable'lari Class Level'da(class'in icinde method'larin disinda)
   ve genellikle class level variable'lar class'in basinda olusturulur,sart degildir.

   Class level'daki variable'lar icin  2 Scope vardir;
    1- static variables (class variables da denir)
    2- instance(static olmayan) variables(object variables da denir)
    */
   int instancSayi = 11 ;//static olmayip class level'da oldugu icin instance variable'dir.


   public static void main(String[] args) {
      int sayi=22;

      /*System.out.println(instancSayi);
        instance variable static olmadigi icin static kulube uye main method'dan direk kullanamayiz.

        ===>instance variable'larin diger adi Object Variable'dir.
        Dolayisiyla object olusturursaniz instance variable'lari heryerden kullanabilirsiniz.
       */
      C01_IntanceVariables obje1 =new C01_IntanceVariables(); //obje olusturduk
      System.out.println("obje1 degismeden: "+obje1.instancSayi); // 11 class level'daki variable burda kullanabildik
      obje1.instancSayi=30;                  // bu method icinde yeni deger atayabiliriz sadece obje1 icin gecerli
      System.out.println("obje1 degistikten sonra: "+obje1.instancSayi); // 30

      C01_IntanceVariables obje2 =new C01_IntanceVariables();
      System.out.println("obje2 degismeden once: "+obje2.instancSayi); //11
      obje2.instancSayi=44;                //yeni atama sadece obje 2 icindir..
      System.out.println("obje2 degistikten sonra: "+obje2.instancSayi);//44

      C01_IntanceVariables obje3 =new C01_IntanceVariables(); //11
      /*
      Her obje olusturuldugunda instance(object)variable'nin ilk atanan degerini alir..
       */
   }
   public static void staticMethod(){
      /*
      System.out.println(sayi);
      bir method'un icinde olusturulan variable sadece o method'un icinden kullanilabilir(Local variable).
       */
      /*
      instancSayi=30;
      instance variable'lara main method disindaki diger static method'lardan da direk ulasamayiz.
      Object olusturursak ulasabiliriz.
       */
      C01_IntanceVariables obje4 = new C01_IntanceVariables();
      System.out.println(obje4.instancSayi);

   }

   public void staticOlmayanMethod(){
      System.out.println(instancSayi);
      /*
      instance variables class icerisindeki static olmayan method'lardan direk kullanilabilir.
       */
   }
   /* ============ INSTANCE VARIABLES OZET OLARAK =========
    * 1- inctance variable class level'da olusturulmalidir.
    * 2- inctance variables static degildir.
    * 3- Mothod'larin icerisinden ulasmak isterseniz statik method'lar icin object yardimiyla
    * static olmayan method'lardan direk ulasilabilir..
    */

}
