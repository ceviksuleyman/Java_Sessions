package day12_stringManipulation;

public class C06_StringManipulation {

    public static void main(String[] args) {

        /*
        String sekline verilen asagidaki fiyatlarin toplamini bulun
        String s1="$13.99";
        String s2="$10.55";
        Double.parseDouble() method!!
         */

        String s1="$13.99";
        String s2="$10.55";

        s1=s1.replaceAll("\\D","");

        double sayi1=Double.parseDouble(s1);

        s2=s2.replaceAll("\\D","");

        double sayi2=Double.parseDouble(s2);

        System.out.println("$"+(sayi1+sayi2)/100);



    }
}
