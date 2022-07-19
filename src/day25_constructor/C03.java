package day25_constructor;

public class C03 {
    /*
    Proje olustururken bazi class'lar Run etmek icin degil variable ve method'lar olusturup
    bunlari baska class'lardan kullanmak icin olusturulur
     */
    /*
    Default constructor parametresizdir,goremesek bile ihtiyac oldugunda calisir.
    Class icerisinde parametreli veya parametresiz herhangi bir constructor olusturursak
    java default constructor'i otomatik olarak siler.
     */

    /*
    Olusturdugumuz parametresiz bu constructor default constructer ile birebir aynidir,
    ama biz olusturdugumuz icin buna default constructor demeyiz,parametresiz constructor deriz.
     */
    C03(){

    }

    String isim = "Etka";

    public void method1(){

        System.out.println("C03 method calisti...");


    }
}
