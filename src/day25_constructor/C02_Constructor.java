package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {

    public static void main(String[] args) {

        // Asil konumuz java bu objeleri nasil olusturuyor ????!!!!!!!!!!
              C01            obje1      =    new          C01()       ;
        // class adi      objenin adi       keyword     constructor

        // Constructor : Bir class'in object uretmesi icin MUTLAKA sahip olmasi gereken bir kod blogudur.!!
        // Java'da bir object olusturabilmek icin mutlaka Constructor Kullanmalisiniz..!!!!!!!!!!!!!
        // Constructor calismadan object olusturulmasi mumkun degildir !!
        // Bunu java kontrol eder.

        /*
        Her class'da constructor var midir ?
        * Java'da class'lar object uretmek icin Constructor kullanir
        * Java'da bir class olusturdugumuzda,Java object olusturabilmemiz icin default Constructor olusturur,
        default Constructor class icinde gorunmez !!
        * Class ismi ile Constructor ismi ayni Olmalidir!! public class MyClass{  MyClass() }
        * Constructor'da mutlaka () olmalidir.  MyClass() !!
        * Constructor'da parametre olmasi istege baglidir.
         */

        /*
        Constructor nerede ve nasil olusturulur ??
        * Class'in icinde method'larin disinda olusturulmalidir !!!!
         */

        // Constructor nedir ?
        // Method degildir
        // Variable degildir

        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();

        List<String> list = new ArrayList<>();
        //List<String> list2 = new List(); // list bir interface'dir o yuzden constructor'u yoktur!!


        System.out.println(obje1.sayi);// C01 class'inda olusturdugumuz variable obje ile burdan aldik
                                       // C01 class'inde sayi variable'ini sadece declare ettik atama yapmadik o yuzden
                                       // default 0 yazdi.
        obje1.sayi = 20; // C01 class'inda olusturdugumuz sayilar variable'ina burda assign yapabiliriz obje kullanarak

        System.out.println(obje1.sayi);// 20

        obje1.denemeMethod();
    }

}
