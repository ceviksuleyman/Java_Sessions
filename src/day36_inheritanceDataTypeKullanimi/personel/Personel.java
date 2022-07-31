package day36_inheritanceDataTypeKullanimi.personel;

public class Personel {

    protected String isim = "Isım Belirtilmedi.";
    protected String soyisim = "Soyisim Belirtilmedi.";
    protected String departman = "Departman Belirtilmedi.";

    protected void maas(){

        System.out.println("Tum personelimiz maas alir.");
    }

    protected void sigorta(){

        System.out.println("Tum personelimize sigorta yapilir.");
    }
}
