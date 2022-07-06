package day03_Scanner;

import java.util.Scanner;

public class C03_ScannerSoru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tane tamsayi giriniz.");

        int sayi1=scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("iki sayinin toplami= "+(sayi1+sayi2)); //string ifadeye dahil olmamaları için
        System.out.println("iki sayinin farki= "+(sayi1-sayi2));   // matematiksel işlemleri paranteze alıyoruz
        System.out.println("iki sayinin carpimi= "+(sayi1*sayi2));
    }
}
