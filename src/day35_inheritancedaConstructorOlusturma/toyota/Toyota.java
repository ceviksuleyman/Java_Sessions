package day35_inheritancedaConstructorOlusturma.toyota;

public class Toyota {
    Toyota(){
        System.out.println("Toyota parametresiz constructor.");
    }

    Toyota(String isim){
        //super(isim); extends olmadigi icin super(); cons. call'u Java kabul etmez.
        System.out.println("Toyota parametreli constructor.");
    }
}
