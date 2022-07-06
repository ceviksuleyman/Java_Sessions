package day10_stringManipulation;

public class C05_length {

    public static void main(String[] args) {
        //length--> String deki karakter sayisini verir  , son index=length()-1 dir

        String str1="Java ogren, isi kap";

        System.out.println(str1.length()); //str1 'in karakter sayisini dondurur..

        System.out.println(str1.charAt(str1.length()-1)); //Son karakteri yazdiralim

        System.out.println(str1.charAt(str1.length()-3)); //sondan 3. karakteri yazdiralim

        /*
        Java'da null pointer bir deger degil, karsisina yazildigi variable'nin hic bir deger
        almadiginin isaretcisidir...
         */

        String str2=""; //str2 ye bir deger atanmis midir ? EVET bu deger: hiclik

        System.out.println(str2.length());//0

        String str3=null; //str3 e bir deger atanmis midir? Hayir null : deger atamamayi isaret etmektedir.

        System.out.println(str3.length()); //NullPointerException



    }
}
