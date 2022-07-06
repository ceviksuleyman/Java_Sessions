package day13_14_methodCreation;

public class C04_MethodCreation {

    public static void main(String[] args) {
        //input olarak verilen isim ve soyismi ilk harfi buyuk geriye kalan harfler * olacak sekilde
        //S******* C***** yazdiran bir method olusturun..

        String isim="asdasd";
        String soyisim="svgddkkjls";

        ismiGizle(isim,soyisim);
        C03_MethodCreation.rakamlariTopla(652);

    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" \n"+soyisim);
    }
}
