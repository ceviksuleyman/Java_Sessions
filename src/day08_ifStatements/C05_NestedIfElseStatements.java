package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfElseStatements {

    public static void main(String[] args) {

        /* Nested if kullanarak soruyu cozun
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin
        Ilk A harf ise "Gecerli sifre" degilse "Gecersiz sifre" yazdirin

        Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.
        ilk harf z ise "Gecerli sifre" degilse "Gecersiz sifre" yazdirin
         */

        //ilk harf buyukmu kucuk mu ?
        //ilk harf A veya z mi ?

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sifre girin..");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){                  //ilk harfi buyuk harf olan kelimeler
            if (ilkHarf=='A'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }



        } else if (ilkHarf>='a'&& ilkHarf<='z') {              //ilk harfi kucuk harf olan kelimeler
            if (ilkHarf=='z'){
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }


        }else {
            System.out.println("Lutfen ilk karakter icin sadece harf kullanin");
        }


    }
}
