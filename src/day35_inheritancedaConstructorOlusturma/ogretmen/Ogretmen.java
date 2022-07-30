package day35_inheritancedaConstructorOlusturma.ogretmen;

public class Ogretmen {

    Ogretmen(){

        System.out.println("Ogretmen parametresiz constructor.");
    }

    Ogretmen(String isim){
        this();
        System.out.println("Ogretmen parametreli constructor.");
    }
}
