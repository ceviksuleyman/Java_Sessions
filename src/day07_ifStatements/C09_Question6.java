package day07_ifStatements;

import java.util.Scanner;

public class C09_Question6 {

    public static void main(String[] args) {

        //Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin
        //sayilarin ikiside negatif ise sayilarin carpimini yazdirin
        //sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilar islem yapamazsın
        //sayilardan 0 'a esit olan varsa "sifir carpmaya göre yutan elemandir yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi girin");
        int sayi1= scan.nextInt();
        System.out.println("ikinci sayiyi girin");
        int sayi2= scan.nextInt();

        if (sayi1>0 && sayi2>0){
            System.out.println("ikisayinin toplami: "+(sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0 ) {
            System.out.println("iki sayinin carpimi: "+ sayi1*sayi2);
        } else if ((sayi1<0 && sayi2>0) || (sayi1>0 && sayi2<0)) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else if (sayi1==0 || sayi2==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }


    }
}
