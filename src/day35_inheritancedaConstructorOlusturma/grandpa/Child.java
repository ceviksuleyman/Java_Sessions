package day35_inheritancedaConstructorOlusturma.grandpa;

public class Child extends Parent{

    String isim = "Child isim belirtilmedi.";
    protected String childKlupAdi = "Child Kulubu";

    Child(){

        System.out.println("Child constructor calisti.");
    }

    public static void main(String[] args) {

        GrandParent gb1 = new GrandParent(); // gb1 objeyi olusturmak icin GrandParent constructor calisir.
                                             // Parent veya Child constructor calismaz.

        Child child1 = new Child();

        child1.grandpaKlupAdi = "Child 1"; // child class'in parent'i Parent Class ,onun da Parent'i GrandParent
        child1.parentKlupAdi = "Child 2";  // oldugu icin(multi-level inheritance) bu Class ismi ile olusturdugumuz
                                           // child1 objesiyle GrandParent'e ulasabildik.


        /*
        Java'da bir class'i kullanabilmek icin o class'tan obje olusturur,dolayisiyla o class'in
        constructor'ini kullanirdik.

        Java inheritance'da parent class'lardaki ozellikleri kullanabilmek icin o class'larin constructor'larini
        otomatik calistiran bir yapi kurmustur.

        Ornegin biz Child class'inda Child class'indan(kendisi) bir obje olusturmak istedigimizde
        Child constructor'ini kullaniriz.

        Java Child(){} constructor'ini gordugunde once parent constructor'i calistirmam lazim der.
        Buradan Parent constructor'ina gider, Parent class'inda Parent(){} constructor'i gorunce once
        bunun parent'inin yani GrandParent constructor calismasi gerekir der.

        Boylece "extends" keyword olmayan class'a kadar gider ve oradan baslayarak tum constructorlari
        asagi dogru calistirir.
         */

    }
}

