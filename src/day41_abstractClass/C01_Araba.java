package day41_abstractClass;

public abstract class C01_Araba {


    /*
    abstract class'da main method opsiyoneldir.
    Eger abstract class sadece child class'larin tasimak zorunda oldugu ozellikleri
    belirlemek icin olusturulduysa main method'a ihtiyac olmaz sadece abstract method'lar olur.

    Ama bir abstract method'da standart belirlemek disinda da method'lar calisabilir.
    Bu durumda ihtiyac olursa main method olusturulabilir.
    */

    protected abstract void yakit();

    protected abstract void kaporta();

    protected abstract void motor(); // abstract method

    /*
    Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen
    method'lar abstract method olur ve abstract method'larin body'si olmaz.
     */


    public void klima() { //concrete method

        System.out.println("Bazi arabalarda klima olabilir.");

        /*
        abstract olmayan method'lara concrete(soyut) method denir.
        abstract bir method'u `abstract` keyword ile belirtmek zorunludur.

        Concrete method'larda bunun declare edilmesine gerek yoktur,
        biz sadece abstraction ile ilgili konustugumuzda abstract olmayan
        method'lardan bahsetmek icin concrete tabirini kullaniriz.
         */
    }
}
