package day13_14_methodCreation;

public class C08_ReturnMethod {

    public static void main(String[] args) {
        /*
        Verilen iki sayiyi carpip sonucu bize donduren methodu olusturun
         */
        int sayi1=10;
        int sayi2=52;

        int sonuc=carpGetir(sayi1,sayi2);

        System.out.println(sonuc);


    }

    public static int carpGetir(int sayi1, int sayi2) {

        int sonuc=sayi1*sayi2;

        return sonuc;
    }
}
