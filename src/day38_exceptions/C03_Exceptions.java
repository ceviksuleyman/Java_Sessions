package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
             /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim.
        Kullaniciya index sorup,o index'teki urunu yazdiran bir program hazirlayalim.
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim.
         */
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Istediginiz urunun sira no girin : ");
        int istenenSira = 0;
        try {
            //try blogu bizim calistirmak istedigimiz ama risk oldugunu dusundugumuz kismi yazar.
            // yani sorun cikmazsa yapacagi islem try blogunda olur.
            istenenSira = scan.nextInt();

        } catch (InputMismatchException e) { // yakalanacak exception turunu yazdigimiz kisim Data turu ve variable(e)

            // catch blogunda da beklenen problem gerceklesirse sonrasinda ne yapacagini yaziyoruz.

            //e.printStackTrace(); hatanin ne oldugunu bize gosterir. System.out.println(e);
            System.out.println("Urun sirasi icin bir tamsayi girmeniz gerekli");

        }

        /*
        catch blogu'unun onundeki parantezde exception class'inin ismi ve yaninda yakalanan exception'i
        atadigimiz variable'in ismi olur (e). "e" yerine herhangi bir isim yazabiliriz.
        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz bu objeyi kullanabilirsiniz.
        Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa `e` kullanilmasa da kod calisir.
         */
        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + (urunler.length) + " olabilir");
        }


        // NOTE
        /*
        try blogu tek basina calismaz.
        try blogundan sonra mutlaka catch block(lari) veya finally block olmalidir.
         */

    }
}
