package day13_14_methodCreation;

public class C05_MethodCreationReturn {

    public static void main(String[] args) {
         /*input olarak verilen isim ve soyismi ilk harfi buyuk geriye kalan harfler * olacak sekilde bize
        bize donduren bir method olusturun.
        not--> programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz
         */

        String isim="asdasd";
        String soyisim="bsdfsd";

        String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(gizliIsim);

    }

    public static String isimGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        return isim+" "+soyisim;
    }
}
