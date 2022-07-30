package day35_inheritancedaConstructorOlusturma.personel;

public class Muhasebe extends Personel{

    Muhasebe(){

        System.out.println("Muhasebe parametresiz constructor.");

    }
    Muhasebe(String isim){

        System.out.println("Muhasebe parametreli constructor.");

    }
}
