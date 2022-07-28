package day34_inheritance;

public class ToyotaCorolla extends Toyota {

    public static void main(String[] args) {

        /*
        Child class'dan parent class'a erisimde access modifier kurallarini bypass edemeyiz.
        Ornegin,parent class'taki private class uyelerini child class'tan kullanamayiz,ayni sekilde parent ve child
        farkli package'larda ise parent class'daki default access moddifier'i olan class uyelerini child class'tan
        kullanamayiz.
         */
        ToyotaCorolla araba1 = new ToyotaCorolla();

        System.out.println(araba1.marka);// Toyota
        System.out.println(araba1.model);// Model Belirtilmedi


        araba1.aku(); // parent class'da olusturdugumuz method'lar
        araba1.motor();

    }
}
