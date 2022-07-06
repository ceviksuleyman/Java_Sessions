package day03_Scanner;

import java.util.Scanner;

public class C01_Scanner7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ismini soyismini ve yaşınızı giriniz \naralarda Enter tusuna basınız...");

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("Girilen bilgiler : "+isim+ " "+soyisim+", "+yas);

    }
}
