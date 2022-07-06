package day12_stringManipulation;

import java.util.Scanner;

public class C07_StringManipulation {

    public static void main(String[] args) {

        /*
        kullanicidan bir sifre isteyin asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi"
        sartlar saglanmiyorsa "islem basarisiz,yeni sifre girin"
        -ilk harf buyuk
        -son harf kucuk
        -bosluk icermemeli
        -sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Sifre giriniz");
        String sifre= scan.nextLine();
        int kontrol=0;

        //ilk harf kontrolu
        if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            kontrol++;
        }else {
            System.out.println("ilk harf buyuk olmalidir!");
        }

        //son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            kontrol++;
        }else {
            System.out.println("son harf kucuk olmali !");
        }


        //bosluk kontrolu
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli!");
        }else {
            kontrol++;
        }


        //sifre uzunluk kontrolu
        if (sifre.length()>=8){
            kontrol++;
        }else {
            System.out.println("Sifre en az 8 karakter olmali!");
        }


        if (kontrol==4){
            System.out.println("Sifre basariyla tanimlandi");
        }else {
            System.out.println("islem basarisiz ,yeni bir sifre girin");
        }






    }
}
