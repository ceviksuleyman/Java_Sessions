package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {

    public static void main(String[] args) {
        /*
        kullanicidan harf isteyin
        kucukse konsola "kucuk harf" ,buyukse "buyuk harf"
        harf degılse "girdiginiz karakter harf degil"  yazdirin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir harf girin");
        char harf=scan.next().charAt(0);

        //String sonuc=(harf>'a'  && harf<'z') ? "Kucuk Harf":"Buyuk harf veya gecersiz karakter";

        String sonuc=harf>='a'  && harf<='z' ? "Kucuk Harf":
                     harf>='A' && harf<='Z' ? "Buyuk harf" : "Gecersiz karakter";//paranteze almasak da calisir

        String sonuc2=(harf>='a'  && harf<='z') ? ("Kucuk Harf"):
                ((harf>='A' && harf<='Z') ? "Buyuk harf" : "Gecersiz karakter");

        System.out.println(sonuc);
        System.out.println("sonuc2 = " + sonuc2);
    }
}
