package day35_inheritancedaConstructorOlusturma.grandpa;

public class Parent extends GrandParent {

    protected String isim = "Parent isim belirtilmedi.";

    protected String parentKlupAdi = "Parent Kulubu";

    Parent(){

        System.out.println("Parent constructor calisti.");
    }
}
