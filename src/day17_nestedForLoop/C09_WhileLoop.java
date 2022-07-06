package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {

    public static void main(String[] args) {
        /*
         kullanicidan bir sifre isteyin asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi"
         sartlar saglanmiyorsa "islem basarisiz,yeni sifre girin" yazdirin ve basarili sifre girinceye
         kadar yeni sifre girmesini isteyin..
           -ilk harf buyuk
           -son harf kucuk
           -bosluk icermemeli
           -sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);
        String sifre="";
        boolean sifreBasariliMi=false;
        int kontrol=0;

        while (!sifreBasariliMi){
            //Kullanicidan bir sifre alalim
            System.out.println("Lutfen bir sifre girin...");
            sifre= scan.nextLine();

            //4 kontrolu yapalim,her gecen kontrol icin kontrol variable'ni bir artiralim

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

            if (kontrol == 4) {  //tum kontroller tamam demek
                System.out.println("sifreniz basariyla tanimlandi");
                sifreBasariliMi=true;


            }else {       //sifre basarisiz ve tekrar basa donecek kontrol variable'i sifirlanmali
                kontrol=0;

            }
        }


    }
}
