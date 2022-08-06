package day41_abstractClass;

public abstract class C02_Toyota extends C01_Araba {


    // abstract bir class'in abstract bir child'i oldugu icin abstract method'lari impelement yapmak zorunda degiliz

    @Override
    public void motor() { // access modifier parenti daraltamaz protected veya public olabilir.

        System.out.println("Toyota arabalar cevreci motor kullanir.");
        /*
        Parent class'daki standart belirleyici method(abstract method)'larin tamami
        child class tarafindan override edilmelidir.
        Concrete method'larin override edilme mecburiyeti yoktur,istersek override edebiliriz
        istemezsek etmeyiz.
        Aslinda Toyota class'i da obje uretecegimiz bir class degil bu durumda eger proje
        tasarimi yapiyorsaniz Toyota class'ini da abstract yapmaniz guzel olur.
         */
    }

}
