package day12_stringManipulation;

public class C03_substring {

    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 6589 7458 9658";

        System.out.println(isim.substring(3)); //eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //fil

        System.out.println(isim.substring(2,4)); //le

        //isim ve soyismin ilk harf buyuk harf gerisi *
        //kredi kartinin ilk 4 rakami gorunur gerisi *

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalan=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlkDort=kartNo.substring(0,4);
        String kkGeriyeKalan=" **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalan+" "+

                soyisimIlkHarf+soyisimGeriyeKalan+ "\n" +

                kkIlkDort+kkGeriyeKalan);

    }
}
