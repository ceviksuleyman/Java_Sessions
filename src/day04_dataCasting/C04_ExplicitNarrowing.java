package day04_dataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {
        // Explicit Narrowing-> Kontrollu Daraltma
        int sayi1=128;
        // byte -128------------>0<------------127  int sayi=128; yazdıgımızda basa doner -128 verir

        byte sayi2=(byte) sayi1;
        System.out.println(sayi2);
        //Genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz Java sizin icin genis data
        //turundeki degerin,dar data turunun sinirlarina uyup uymayacagini calistirana kadar bilemez
        //ama Java risk almaz
        //riski sifira indirmek icin burada bir sorun olursa sorumlulugu kabul etmenizi bekler
        //bunun icin degerin onune parantez icerisinde istedigimiz data turunu yazmamız yeterlidir..

        // bu riski ustlendigimizde,3 durum olusabılır
        //1- bizim degerimiz dar, dar kalip degerlerine uygun olursa hic kayıp olmadan cast olur
        //2-double bir sayiyi int e cast etmek gibi durumlarda data kaybı yasanabilir
        //3- genis kaliptan degeri dar kaliba koydugunuzda sinirlari asan durumlarda veri baskalasabilir


    }
}
