package day35_inheritancedaConstructorOlusturma.toyota;

public class Corolla extends Toyota {

    Corolla(){
        System.out.println("Corolla parametresiz constructor.");
    }

    Corolla(String isim){
        super(isim); // parametreli super den Toyota parametreli cons'a gitti.
        System.out.println("Corolla parametreli constructor.");
    }
}
