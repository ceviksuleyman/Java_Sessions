package day34_inheritance;

public class Isci extends Personel {

    /*
   => Normal hayatimizda parent cocuk sahibi olmaya karar verebilir.

   => Java'da ise child class'lar ozelliklerini inherit etmek istedikleri class'i kendilerine parent edinirler.

   => mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek Personel class'indaki tum variable ve
   method'lara ihtiyaci oldugunu gorebiliriz.

   => Bu durumda yeniden o variable ve method'lari olusturmak yerine Personel class'ini kendimize parent ediniriz.

   => Bir class'i parent edinmek icin extends keyword kullanmaliyiz  public class Isci extends Personel{}

   => Bir class baska bir class'i parent edindiginde,
   1. parent class'daki tum ozelliklere(variable , Method) otomatik olarak sahip olur.
   2. parent class'daki ozelliklerden bazilarini kendine uyarlayabilir.
   3. parent class'da olmayan bazi yeni ozellikler olusturabilir.
   NOTE => parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir.!!
    */
    protected int personelNo = 1001;

    public static void main(String[] args) {

        Isci isci1 = new Isci();

        System.out.println(isci1.isim);// Isim belirtilmedi
        System.out.println(isci1.departman); // Departman belirtilmedi

        //Kendi class'imizda isim variable'i yok onun icin parent'a gidiyoruz.
        isci1.isim="Murtaza";
        isci1.departman = "Muhasebe";
        System.out.println(isci1.isim);// Murtaza
        System.out.println(isci1.departman); // Muhasebe

        System.out.println(isci1.personelNo); // 1001  class icinde varsa  onu yoksa parent'ten kullanir.


        isci1.maas();// isciler minimum 15 euro saat ucreti alir
        // parent class'daki ile ayni isim de olusturdugumuz maas method'u oldugunda parent class'dan degil
        // child class'da yani bu class'da olusturdugumuz method'u kullandi.



        isci1.ozelSigorta(); // iscilerden isteyene %50 indirimli ozel sigorta yaptirilir

        isci1.fazlaMesaiUcreti(); // Personel fazla mesai ucretini statusune gore alir



        System.out.println(isci1); // altta olusturdugum toString kullanmak icin

    }

    public void maas(){  // maas method

        System.out.println("isciler minimum 15 euro saat ucreti alir");

    }

    public void ozelSigorta(){ // ozelSigorta method

        System.out.println("iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");

    }

    @Override
    public String toString() {
        return "  *** Isci *** "+
                "\npersonelNo : " + personelNo +
                "\nisim       : " + isim +
                "\ndepartman  : " + departman;
    }

}
