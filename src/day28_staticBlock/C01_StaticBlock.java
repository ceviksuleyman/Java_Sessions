package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    /*
    1- Static block class uyelerinin tamamindan(main method,method,constructor) once calisir.

    2- static block class olusturuldugunda calisir genellikle de class'la ilgili on ayarlamalar veya static
    variable'lara deger atamak icin kullanilir.

    3- static block'larin class icerisinde nerede oldugu onemli degildir,once static block'lar calisir.

    4- birden fazla static block varsa yukaridan asagi dogru calisir.
     */

    static { // static block

        System.out.println("static blok calisti.");
        sayi=10;

    }

    public static void main(String[] args) {

        System.out.println("main method calisti.");
        System.out.println(sayi);

    }

    static {  //static block

        System.out.println("main method altindaki static block calisti.");

    }

}
