package day35_inheritancedaConstructorOlusturma.grandpa;

public class GrandParent {

    protected String isim = "Grandpa isim belirtilmedi.";
    /*
     Her class'da gorunmese bile bir constructor vardir.
     Bu class'dan obje olusturmak istedigimizde default constructor devreye girecektir.

     Default constructor'i gozlemleyemeyecegimiz icin onun yerine kullanilabilecek
     parametresiz constructor olusturalim.
     */
    protected String grandpaKlupAdi = "Grandpa Kulubu";
   GrandParent(){

       System.out.println("GrandParent constructor calisti.");
   }
}
