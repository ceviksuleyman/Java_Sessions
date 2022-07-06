package day13_14_methodCreation;

import java.util.Scanner;

public class C06_MethodCreationReturn {

    public static void main(String[] args) {
         /*
        Kullanicidan sehir ismini ve dogum tarihini alip bunlari programda kullanacagimiz formatta bize
        donduren bir method olusturun,sehir ismini programimizda buyuk harf olarak
       tarihi ise 2022-07-01 seklinde kullanmak istiyoruz
         */

        /*Not
        Eger bir class'in icerisinde herhangi bir hesaplama yapip bunu da kalici olarak saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip sonucunu main method'a dondurebiliriz
        Return type'i void olmayan bir method'un sonucunu main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu yeni degeri kullanma sansimiz olur..
         */
        String sehir=sehirAl();
        String tarih=tarilAl();

        System.out.println("sehir: "+sehir);
        System.out.println("dogum tarihi: "+tarih);

    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Sehir ismini girin");
        String sehir= scan.next().toUpperCase();

        return sehir;

    }

    public static String tarilAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);

        //yil
        System.out.println("yil giriniz");
        int yil= scan.nextInt();

        if (yil>1900 && yil<2100){
            tarih=yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100");
        }


        //ay
        System.out.println("Kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay= scan.nextInt();

        if (ay<=0 || ay>12){
            System.out.println("ay no 1-12 arasinda olmalidir");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }


        //gun
        System.out.println("Lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz");
        int gun= scan.nextInt();

        if (gun<=0 || gun>31){
            System.out.println("gun no olarak 1-31 arasinda bir sayi girilmelidir");
        } else if (gun<10) {
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }

        return tarih;


    }

}
