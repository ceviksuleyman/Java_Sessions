package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {
        /*
        Emeklilik kontrolu yapan bir program yazin cinsiyet olarak E(erkek) veya K(kadin) degiskenleri
        kabul etsin farkli bir harf veya sembol girilirse hata mesaji versin

        emeklilik icin kadinlarda yas sinir 60 erkeklerde 65 olsun
        negatif yas veya 80 den büyük girilirse hata mesaji versin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyet girin..\nkadin icin K,erkek icin E harfi giriniz..");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi girin...");
        double yas=scan.nextDouble();

        if (cinsiyet=='E'){
            if(yas<0||yas>80){
                System.out.println("gecerli yas girin !");
            } else if (yas<65) {
                System.out.println("Emekli olamazsin "+(65-yas)+" yil daha calismalisin");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet=='K') {
                if(yas<0||yas>80){
                    System.out.println("gecerli yas girin !");
                } else if (yas<60) {
                    System.out.println("emekli olamazsin "+(60-yas)+" yil daha calismalisin");
                }else {
                    System.out.println("Emekli olabilirsin");
                }


        }else {
            System.out.println("Lutfen gecerli bir tercih girin");
        }

    }
}
