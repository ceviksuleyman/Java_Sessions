package day34_inheritance;

public class Personel {

    /*
    Eger parent class olacak sekilde tasarladiginiz bir class varsa veya ilerde bu class'i
    parent yapmak isteyenler olabilir diyorsaniz o zaman variable ve method'larin
    access modifier'ini "protected" yapmaktir.
     */
    protected int personelNo;
    protected String isim = "Isim belirtilmedi";
    protected String departman = "Departman belirtilmedi";


    protected void maas(){ // method

        System.out.println("Tum personelin maasi vardir");

    }

    protected void mesai(){ // method

        System.out.println("Tum personel statusune gore mesai yapar");

    }

    public void fazlaMesaiUcreti(){ // method

        System.out.println("Personel fazla mesai ucretini statusune gore alir");

    }

}
