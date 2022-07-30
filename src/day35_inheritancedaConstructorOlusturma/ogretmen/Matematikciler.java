package day35_inheritancedaConstructorOlusturma.ogretmen;

public class Matematikciler extends Ogretmen{

    Matematikciler(){
        // default super(); cons. oldugu icin parent'te parametresiz cons.'a gider.
        System.out.println("Matematik parametresiz constructor.");
    }

    Matematikciler(String isim){
        this(); // bu class'daki parametresiz cons'a gider.
        System.out.println("Matematik parametreli constructor.");
    }

    public static void main(String[] args) {

        Matematikciler obje1 = new Matematikciler("Murtaza");

         /*
          this() constructor call ,icinde bulunulan class'daki constructor'lari,
          super() ise parent class'da bulunan constructor'lari cagirir.

          this() veya super(), parametre yapisina uygun constructor bulamazsa Java CTE verir.

          Constructor konusunda gordugumuz this. o class'daki instance variable'lari refere ediyordu.

          Inheritance'da da super. vardir.
          super. parent class'daki instance'lari refere eder.
           */

    }
}
