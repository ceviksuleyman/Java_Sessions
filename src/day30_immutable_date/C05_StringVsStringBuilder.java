package day30_immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {

    public static void main(String[] args) {

        // String mi yoksa StringBuilder mi daha hizlidir.Bunun icin bir String olusturup,sonuna 1000 kere . ekleyelim
        // oncesinde ve sonrasinda zamani alip aradaki farki bulalim.
        // ayni islemi StringBuilder icin de yapalim.

        LocalTime baslangic = LocalTime.now();

        String str = "Ahhhh Java";

        for (int i = 0; i < 10000; i++) {

            str += ".";
        }

        LocalTime bitis = LocalTime.now();

        System.out.println("baslangic :"+baslangic);
        System.out.println("bitis : "+bitis);

        System.out.println("String zaman : "+(bitis.getNano()-baslangic.getNano()));


        //--------------

        LocalTime baslangic2 = LocalTime.now();

        StringBuilder sb = new StringBuilder("Ahhh Java");

        for (int i = 0; i < 1000; i++) {

            sb.append(".");
        }

        LocalTime bitis2 = LocalTime.now();

        System.out.println("baslangic2 :"+baslangic2);
        System.out.println("bitis2 : "+bitis2);

        System.out.println("String zaman : "+(bitis2.getNano()-baslangic2.getNano()));


    }
}
