package day37_overriding.araba;

public class Araba {

    private void yakit(){
        /*
        Parent class'dan override edilmesini istemediginiz method'lari private,static
        veya final access modifier kullanilabilir.
         */

        System.out.println("Tum arabalar yakit kullanir.");
    }
    void marka(){

        System.out.println("Tum arabalarin markasi vardir.");
    }
    void motor(){

        System.out.println("Tum arabalarin motoru vardir.");
    }
}
