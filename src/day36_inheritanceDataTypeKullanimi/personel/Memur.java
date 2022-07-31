package day36_inheritanceDataTypeKullanimi.personel;

public class Memur extends Muhasebe {
    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas(){

        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir.");
    }

    protected void ozelSigorta(){

        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {

        Memur memur1 = new Memur(); // bu(Memur) class'dan olusturduk once bu class'a bakar.

        System.out.println("memur1.gunlukMesai = " + memur1.gunlukMesai);//9  Memur class
        System.out.println("memur1.saatUcreti = " + memur1.saatUcreti);//12  Memur class

        memur1.maas();// Memurlar : 3240 maas alir. bu class'dan method (Memur)
        memur1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir. Bu(Memur) class'dan method
        memur1.sigorta();// Tum personelimize sigorta yapilir. (Personel parent)'ten method

        System.out.println("memur1.isim = " + memur1.isim);// Isım Belirtilmedi. (Personel parent)
        System.out.println("memur1.soyisim = " + memur1.soyisim); // Soyisim Belirtilmedi.  (Personel parent)
        System.out.println("memur1.departman = " + memur1.departman);// Departman Belirtilmedi.  (Personel parent)

        //----------------------------------------------------------------------------------------------------------
        Muhasebe muhasebe1 = new Muhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsam da olusturudugum obje Muhasebe class'indan
        cunku data turu ve constructor Muhasebe

        String = "Cevik"
        ArrayList<Integer> list = new ArrayList<>();
        Integer = 20;

        Muhasebe class'i da obje olusturabilen bir class'dir yani data turudur.
        Obje olusturdugumuz her class ayni zamanda data turudur.
         */

        System.out.println("muhasebe1.gunlukMesai = " + muhasebe1.gunlukMesai);//8 Muhasebe parent
        System.out.println("muhasebe1.saatUcreti = " + muhasebe1.saatUcreti);//10 Muhasebe

        muhasebe1.maas();// Personel minimum : 2400 maas alir.  Muhasebe
        muhasebe1.ozelSigorta(); //Isteyen calisanlara %50 indirimli ozel sigorta yapilir. Muhasebe
        muhasebe1.sigorta();//Tum personelimize sigorta yapilir. Personel

        System.out.println("muhasebe1.isim = " + muhasebe1.isim);// Isım Belirtilmedi. Personel
        System.out.println("muhasebe1.soyisim = " + muhasebe1.soyisim); // Soyisim Belirtilmedi.  Personel
        System.out.println("muhasebe1.departman = " + muhasebe1.departman);// Departman Belirtilmedi.  Personel

    }
}
