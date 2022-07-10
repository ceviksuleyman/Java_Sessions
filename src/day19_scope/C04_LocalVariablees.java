package day19_scope;

public class C04_LocalVariablees {

    public static void main(String[] args) {

        int sayi=10;
        // System.out.println(sayiMethod); sayiMethod method1'de olusturulmus local variable'dir.


        for (int i = 0; i <20 ; i++) {
        }
       // System.out.println(i); i loop'da olusturulmus local variable'dir,sadece loop icerisinde kullanilabilir.


        //  satatic int sayiStatic = 12;  static keyword sadece class level'da kullanilabilir.
        //  Method'larin icerisinde static variable TANIMLANAMAZ !

    }
    public static void method1( ){

        //  System.out.println(sayi); sayi main method'da olusturulmus local bir variable'dir, sadece main method'da
        // gecerlidir.

        int sayiMethod=10;

        //-----------Scope Ozet-----------
        /*
        Scope: Class icerisinde olusturulan variable'larin kapsamini(nereden erisilebilecegini) belirler.

               ------Temel olarak 4 Scope'dan bahsedebiliriz------
         Class level'da olusturulan variable 'lar class'in tamaminda gecerlidir,ancak direk erisim icin static keyword
         belirleyicidir.
             1 - static olarak tanimlanan variable'lara tum method'lardan ulasilabilir.
             2 - static olarak tanımlanmayan(instance) variable'lara sadece static olmayan method'lardan ulasilabilir.
         local olarak olusturulan variable'lar sadece tanimlandiklari scope'da gecerlidirler.
             3 - bir method'da olusturulan variable'lara sadece o method'dan ulasilabilir.
             4 - loop icerisinde olusturulan variable'a loop disindan erisilemez.
         */

    }
}
