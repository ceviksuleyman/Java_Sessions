package day37_overriding.araba;

public class Toyota extends Araba {

    @Override
    void marka() {
        //super.marka(); Eger hem overridden hem de overriding method'un calismasini istersek
        //ilk satira super.marka() yazabiliriz. !!!!!!
    }
    void motor(){

        System.out.println("Toyota araclar toyota marka motor kullanir.");
    }
}
