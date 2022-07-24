package day27_consCall_StaticKeyword;

public class C06_StaticMethods {

    /*
    1- Return Type'den once static keyword kullanarak ,static method olusturabiliriz.
    2- Static method'lar static variable(class variables)'lari direk kullanabilirler.
    3- Static method'lar static ve non-static method'lardan cagrilabilir.
     */

    static int sayi1 = 10;
    int sayi2 = 20;

    public static void main(String[] args) {


        System.out.println(sayi1);

        //System.out.println(sayi2); static olmayan variable'la static method'lardan ulasamayiz
    }

    public static void method1(){ //static  method

        method2(); // static method cagirdim

        System.out.println(sayi1);

        //System.out.println(sayi2); static olmayan variable'la static method'lardan ulasamayiz

        //C06_StaticMethods obj1 = new C06_StaticMethods(); // obje olusturarak ulasabiliriz.

    }

    public static void method2(){


    }
    public void method3(){

        method1(); // static olan method'u non-static method'a cagirabilirim

    }
}
