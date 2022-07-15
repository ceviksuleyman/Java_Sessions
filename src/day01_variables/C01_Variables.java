package day01_variables;

public class C01_Variables {

    public static void main(String[] args) {
        // variable olusturmak ve deger atamak farkli islemlerdir
        // istersek variable olusturma ve deger atamayi tek satirda yapabiliriz

        String ogrenciIsim = "java ogreniyorum";

        System.out.println(ogrenciIsim);

        // istersek de once olusturur , istedigimiz zaman da deger atayabiliriz
        int sayi;
        sayi=1993;

        System.out.println(sayi);
        // biz daha once olusturulmus ve deger atamasi yapilmiş bir degiskene
        // yeni deger atayabiliriz
        //bu durumda java variable nin eski degerini silip yeni degeri variable a atar

         sayi=1905;
         System.out.println(sayi); // 1905

         ogrenciIsim="benim canimi sikmayin";

         System.out.println(ogrenciIsim); //benim canimi sikmayin

    }

}
