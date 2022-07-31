package day36_inheritanceDataTypeKullanimi.personel;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Isci extends Muhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;


    protected void maasIsci(){

        System.out.println("Isci : "+(30*saatUcreti*gunlukMesai)+" maas alir.");
    }

    protected void ozelSigortaIsci(){

        System.out.println("Isci %70 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {

        // Muhasebeden
        Muhasebe isci1 = new Isci(); // data turu Muhasebe,constructor Isci ! iscinin muhasebe class'inda butun
                                     //calisanlarla beraber olan hakkettigi ortak ozellikleri gormek istiyorum.

        /*
        Bir obje olusturulurken data turu ve constructor ayni class'dan ise direk o class'a gidiyorduk

        Eger data turu ve constructor farkli ise Obje constructor'in oldugu class'in objesidir,
        ancak bizden istenen Isci class'indaki spesifik ozellikler degil, bir iscinin
        Muhasebe class'inda tum calisanlarla beraber sahip oldugu genel ozellikleri istiyoruz
         */

        System.out.println("isci1.gunlukMesai = " + isci1.gunlukMesai); // 8 Muhasebeden parent
        System.out.println("isci1.saatUcreti = " + isci1.saatUcreti);// 10 Muhasebe parentten

        isci1.maas();// 2400 maas alir. Muhasebe
        isci1.ozelSigorta();// Isteyen calisanlara %50 indirimli ozel sigorta yapilir. Muhasebe
        isci1.sigorta();//  Tum personelimize sigorta yapilir. Personel Parent

        System.out.println("isci1.isim = " + isci1.isim);// Isim Belirtilmedi. Personel
        System.out.println("isci1.soyisim = " + isci1.soyisim);// Soyisim Belirtilmedi Personel
        System.out.println("isci1.departman = " + isci1.departman);// Departman Belirtilmedi. Personel


        //Personelden
        Personel isci2 = new Isci();

        //System.out.println("isci2.gunlukMesai = " + isci2.gunlukMesai); // Personelde gunlukmesai yok CTE
        //System.out.println("isci2.saatUcreti = " + isci2.saatUcreti);// Personelde saatUcreti yok CTE

        isci2.maas();//Personel minimum : 2400 maas alir. normalde Personel Class'indan almasi (Override)
                     //gerekirdi Muhasebeden aldi bu sonraki class'da aciklanacak(YanHizmetliler Class)

        //isci2.ozelSigorta();// Personelde ozelSigorta yok CTE
        isci2.sigorta();// Tum personelimize sigorta yapilir.

        System.out.println("isci2.isim = " + isci2.isim);// Isim Belirtilmedi. Personel
        System.out.println("isci2.soyisim = " + isci2.soyisim);// Soyisim Belirtilmedi Personel
        System.out.println("isci2.departman = " + isci2.departman);// Departman Belirtilmedi. Personel

        /*
        Eger data turu olan class'da aradigimiz ozellik yoksa, varsa onun parent'ina
        gidebilir ama child'a donus olmaz ,aradigi ozelligi bulamazsa CTE verir
         */


        List<String> list1 = new LinkedList<>();
        Deque<String> list2 = new LinkedList<>();
        Queue<String> list3 = new LinkedList<>();
        /*
        Hepsi LinkedList olsa da
        => list1 list gibi davranir
        => list2 Deque gibi davranir
        => list3 Queue gibi davranir
         */

    }
}
